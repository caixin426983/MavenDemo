package study.day_26;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;


/**
 * Created by CX on 2018-1-11.
 * TCP协议发送数据
 *      A:创建发送端的Socket对象
 *      B:获取输出流，写数据
 *      C：释放资源
 */
public class TCP_ClientDemo {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("CX",8888);
        OutputStream os = socket.getOutputStream();
        os.write("TCP Hello".getBytes());
        socket.close();
    }
}
