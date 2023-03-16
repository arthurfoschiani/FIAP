package Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import Model.Movie;

public class MovieService {
	public static HashMap<Integer, Movie> getMovies() throws ClientProtocolException, IOException {

		HashMap<Integer, Movie> movies = new HashMap<Integer, Movie>();

		HttpGet request = new HttpGet("https://sujeitoprogramador.com/r-api/?api=filmes");

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

				CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();

			if (entity != null) {

				String result = EntityUtils.toString(entity);

				JSONArray payload = new JSONArray(result);

				for (int i = 0; i < payload.length(); ++i) {

					JSONObject filme = payload.getJSONObject(i);
					
					Movie movie = new Movie(filme.getInt("id"), filme.getString("nome"), filme.getString("sinopse"));
					
					movies.put(movie.getId(), movie);
				}
			}
		}

		return movies;
	}
}
