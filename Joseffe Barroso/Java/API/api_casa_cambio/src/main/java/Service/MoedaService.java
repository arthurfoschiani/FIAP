package Service;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.Gson;

import Model.Cotacao;

public class MoedaService {
	public float getConversao(String conversor) throws ClientProtocolException, IOException {
	       
        HttpGet request = new HttpGet("https://economia.awesomeapi.com.br/json/last/" + conversor);
       
        float valorMoeda = 0;
       
        try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
               
                CloseableHttpResponse response = httpClient.execute(request)) {
           
            HttpEntity entity = response.getEntity();
           
            if(entity != null) {
               
                String result = EntityUtils.toString(entity);


                JSONObject payload = new JSONObject(result);
                                               
                conversor = conversor.replace("-", "");
               
                valorMoeda = (float) Double.parseDouble(payload.getJSONObject("USDBRL").get("ask").toString());
            }
        }
        return valorMoeda;
    }
}
