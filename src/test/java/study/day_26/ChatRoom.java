package study.day_26;

import java.io.IOException;
import java.net.DatagramSocket;

/**
 * Created by CX on 2018-1-11.
 *  聊天室
 */
public class ChatRoom {

    public static void main(String[] args) throws IOException{

        DatagramSocket ds = new DatagramSocket();
        DatagramSocket ds1 = new DatagramSocket(12345);

        SendThread st=   new SendThread(ds);
        ReceiveThread rt = new ReceiveThread(ds1);

        Thread t1 = new Thread(st);
        Thread t2 = new Thread(rt);
        t1.start();
        t2.start();


    }
}
