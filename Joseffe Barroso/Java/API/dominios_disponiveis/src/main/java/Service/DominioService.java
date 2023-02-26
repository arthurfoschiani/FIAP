package Service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import Model.Dominio;

public class DominioService {
	public void verificarDominio(Dominio dominio) throws URISyntaxException, IOException {
		
		HttpGet request = new HttpGet("https://brasilapi.com.br/api/registrobr/v1/" + dominio.getNome());
		
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();
	               
                CloseableHttpResponse response = httpClient.execute(request)) {
           
            HttpEntity entity = response.getEntity();
           
            if(entity != null) {
               
                String result = EntityUtils.toString(entity);


                JSONObject payload = new JSONObject(result);
               
                if (payload.has("status") && payload.get("status").toString().equals("AVAILABLE")) {
                    dominio.setDisponivel(true);
                } else {
                    dominio.setDisponivel(false);
                    if (payload.has("expires-at")) {
                        String dataExpiracaoStr = payload.get("expires-at").toString();
                        String dataSemFuso = dataExpiracaoStr.substring(0, 10);
                        LocalDate dataExpiracao = LocalDate.parse(dataSemFuso, DateTimeFormatter.ISO_LOCAL_DATE);
                        dominio.setDataExpiracao(dataExpiracao);
                    }
                }
            }
        }
    }
}
