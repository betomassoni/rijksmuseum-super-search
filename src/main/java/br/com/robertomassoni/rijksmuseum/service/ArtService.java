package br.com.robertomassoni.rijksmuseum.service;

import br.com.robertomassoni.rijksmuseum.model.Collection;

public interface ArtService {
    
    public Collection getCollection(String term, String involvedMaker, String results, String page, String type, String material, String technique, String period);
}
