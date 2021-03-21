package br.com.robertomassoni.rijksmuseum.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Levels {
    private String name;
    private int width;
    private int height;
    private List<Tiles> tiles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public List<Tiles> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tiles> tiles) {
        this.tiles = tiles;
    }
    
    
}
