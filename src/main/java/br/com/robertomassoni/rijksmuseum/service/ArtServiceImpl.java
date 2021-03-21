package br.com.robertomassoni.rijksmuseum.service;

import br.com.robertomassoni.rijksmuseum.config.PropertiesConfig;
import br.com.robertomassoni.rijksmuseum.model.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import java.util.Optional;

@Component
public class ArtServiceImpl implements ArtService {

    private static PropertiesConfig propertiesConfig;

    @Autowired
    public ArtServiceImpl(PropertiesConfig propertiesConfig) {
        ArtServiceImpl.propertiesConfig = propertiesConfig;
    }

    @Autowired
    private WebClient webClientCollections;

    @Autowired
    private WebClient webClientImages;

    @Override
    public Collection getCollection(String term, String involvedMaker, String results, String page, String type, String material, String technique, String period) {

        Optional<String> apiKey = Optional.ofNullable(propertiesConfig.getConfigValue("api.key"));

        Mono<Collection> monoArt = this.webClientCollections
                .method(HttpMethod.GET)
                .uri(uriBuilder -> uriBuilder
                .queryParam("involvedMaker", involvedMaker)
                .queryParam("q", term)
                .queryParam("ps", results) //results per page
                .queryParam("p", page) // page
                .queryParam("imgonly", true)
                .queryParam("s", "relevance") // sortBy relevance, objecttype, chronologic, achronologic, artist, artistdesc
                .queryParam("type", type)
                .queryParam("material", material) //marble (rock)
                .queryParam("technique", technique)
                .queryParam("f.dating.period", period) //century 0-21
                .queryParam("key", apiKey.get()) // key
                .build())
                .retrieve()
                .bodyToMono(Collection.class);
        Collection collection = monoArt.block();

        return collection;
    }


}




