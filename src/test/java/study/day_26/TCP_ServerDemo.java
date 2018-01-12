package study.day_26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by CX on 2018-1-11.
 */
public class TCP_ServerDemo {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(8888);


        Socket accept = socket.accept();
        InputStream is = accept.getInputStream();

        byte[] bytes = new byte[1024];
        int read = is.read(bytes);
        String s = new String(bytes, 0, read);
        System.out.println(s);
        System.out.println(accept.getLocalAddress().getHostName());
        accept.close();

    }

}
