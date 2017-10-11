package HTTP;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-10-11.
 * 使用HttpClient进行Post方式通信
 */
public class HttpClientPost {

    static class  Post extends  Thread{

        CloseableHttpClient client  = HttpClients.createDefault();

        @Override
        public void run() {
            try {
                HttpPost post = new HttpPost("https://api.douban.com/v2/book/1220562");
                //设置要传递的参数
                List parameters  = new ArrayList();
                //parameters.add(new BasicNameValuePair("key","value"));

                post.setEntity(new UrlEncodedFormEntity(parameters,"UTF-8"));
                CloseableHttpResponse response = client.execute(post);
                HttpEntity entity = response.getEntity();
                String result = EntityUtils.toString(entity, "UTF-8");

                System.out.println(result);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
        new Post().start();
    }

}
