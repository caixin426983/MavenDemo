package HTTP;



import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2017-10-10.
 * 使用Http中的POST方法进行Http通信
 * 使用POST进行通信，与GET不用的是需要把请求放在Http正文中。
 * 具体的步骤：
 * 首先，创建URL。
 * 其次打开链接，设置允许读取和上传的权限。
 * 然后，设置读取方式为POST，创建输出流，将向服务器传输的数据一次性写出，再获取输入流，从输入流中读取数据。
 */
public class TestPost {

    /**
     * 测试成功
     */
   static class ReadByPost extends  Thread{
        @Override
        public void run() {
            try{
                URL url = new URL("https://api.douban.com/v2/book/1220562");
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.addRequestProperty("encoding","UTF-8");
                conn.setDoInput(true);//允许从服务器上获取数据
                conn.setDoOutput(true);//允许从服务器传输数据
                conn.setRequestMethod("POST");

                OutputStream os = conn.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                BufferedWriter bw = new BufferedWriter(osw);

                //bw.write("向服务器传递的参数");
                bw.flush();

                InputStream is = conn.getInputStream();
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader br = new BufferedReader(isr);
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = br.readLine()) != null){
                    builder.append(line);
                }

                //关闭资源
                bw.close();
                osw.close();
                os.close();

                br.close();
                isr.close();
                is.close();

                System.out.println(builder.toString());
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        new ReadByPost().start();
    }

}
