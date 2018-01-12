package study.day_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Created by CX on 2018-1-11.
 */
public class SendThread implements Runnable{


    private DatagramSocket ds ;

    public SendThread(DatagramSocket ds ){
        this.ds=ds;
    }

    public void run() {
        try {
            // 封装键盘录入数据
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while ((line = br.readLine()) != null) {
                if ("886".equals(line)) {
                    break;
                }

                // 创建数据并打包
                byte[] bys = line.getBytes();
                // DatagramPacket dp = new DatagramPacket(bys, bys.length,
                DatagramPacket dp = new DatagramPacket(bys, bys.length,
                        InetAddress.getByName("192.168.0.105"), 12345);

                // 发送数据
                ds.send(dp);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
