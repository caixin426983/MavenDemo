package study.day_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 * Created by CX on 2018-1-10.
 * 1.UDP 协议发送数据
 * A:创建发送端Socket对象
 * B:创建数据，并把数据打包
 * C:调用Socket对象的发送方法发送数据包
 * D：释放资源
 */
public class UDP_SendDemo {

    public static void main(String[] args) throws IOException {
        // 创建发送端的Socket对象
        DatagramSocket ds = new DatagramSocket();

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
            // InetAddress.getByName("192.168.12.92"), 12345);
            DatagramPacket dp = new DatagramPacket(bys, bys.length,
                    InetAddress.getByName("172.16.0.101"), 12345);

            // 发送数据
            ds.send(dp);
        }
        // 释放资源
        ds.close();
    }
}
