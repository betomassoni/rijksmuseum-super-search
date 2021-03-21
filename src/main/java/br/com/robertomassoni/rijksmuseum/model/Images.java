package br.com.robertomassoni.rijksmuseum.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Images {
    private List<Levels> levels;

    private String mediumImageUrl;

    public List<Levels> getLevels() {
        return levels;
    }

    public void setLevels(List<Levels> levels) {
        this.levels = levels;
    }

    public String getMediumImageUrl() {
        return mediumImageUrl;
    }

    public void setMediumImageUrl(String mediumImageUrl) {
        this.mediumImageUrl = mediumImageUrl;
    }

}
