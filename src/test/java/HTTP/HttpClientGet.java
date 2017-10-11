package HTTP;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by Administrator on 2017-10-11.
 * 使用HttpClient进行Get方式通信
 */
public class HttpClientGet {

    /**
     *
     */
    static class Get extends  Thread {
        HttpClient client = HttpClients.createDefault();

        @Override
        public void run() {

            HttpGet get = new HttpGet("https://api.douban.com/v2/book/1220562");
            try {
                HttpResponse response = client.execute(get);
                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity, "UTF-8");
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Get().start();
    }



}
