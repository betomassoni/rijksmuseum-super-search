package br.com.robertomassoni.rijksmuseum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RijksmuseumApplication {

	public static void main(String[] args) {
		SpringApplication.run(RijksmuseumApplication.class, args);
	}

	@Bean
	public WebClient webClientCollections(WebClient.Builder builder) {
		return builder
				.baseUrl("https://www.rijksmuseum.nl/api/en/collection")
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
				.build();
	}
}
