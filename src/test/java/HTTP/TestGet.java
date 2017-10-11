package HTTP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 2017-10-10.
 * 使用Http的get方法读取数据
 * GET方法主要实在建立URL链接后通过URLconnection实例调用getInputStream方法得到数据流，然后进行输出。
 */
public class TestGet {


    public static void main(String[] args) {
        new ReadByGet().start();
    }

    /**
     * 方法测验成功
     */
    static class ReadByGet extends Thread{

        @Override
        public void run() {
            try{
                URL url = new URL("http://127.0.0.1:8081/web-ssm/menu/getMenu.do");
                URLConnection connection = url.openConnection();
                InputStream is = connection.getInputStream();
                //如果有乱码是在InputStreamReader中可以指定编码，手动指定为UTF-8
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);

                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = br.readLine())!= null){
                    builder.append(line);
                }
                br.close();
                isr.close();
                is.close();

                System.out.println(builder.toString());
            }catch (MalformedURLException e){
                // TO DO Auto - generated catch block
                e.printStackTrace();
            }catch (IOException e){
                // TO DO Auto - generated catch block
                e.printStackTrace();
            }

        }
    }


}
