package study.day_26;

import java.io.IOException;
import java.net.*;

/**
 * Created by CX on 2018-1-10.
 *  A:创建接受端Socket对象
 * B:创建一个数据包（接受容器）
 * C:调用Socket对象的接受方法接受数据包
 * D:解析数据包，并显示在控制台
 * E：释放资源
 */
public class UDP_ReceiveDemo {

    public static void main(String[] args) throws IOException {
        // 创建接收端的Socket对象
        DatagramSocket ds = new DatagramSocket(12345);

        while (true) {
            // 创建一个包裹
            byte[] bys = new byte[1024];
            DatagramPacket dp = new DatagramPacket(bys, bys.length);

            // 接收数据
            ds.receive(dp);

            // 解析数据
            String ip = dp.getAddress().getHostAddress();
            String s = new String(dp.getData(), 0, dp.getLength());
            System.out.println(s);
        }
    }



}
