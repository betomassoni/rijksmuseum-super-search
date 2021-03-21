package br.com.robertomassoni.rijksmuseum.model;

public class WebImage {
    private String guid;
    private int offsetPercentageX;
    private int offsetPercentageY;
    private int width;
    private int height;
    private String url;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public int getOffsetPercentageX() {
        return offsetPercentageX;
    }

    public void setOffsetPercentageX(int offsetPercentageX) {
        this.offsetPercentageX = offsetPercentageX;
    }

    public int getOffsetPercentageY() {
        return offsetPercentageY;
    }

    public void setOffsetPercentageY(int offsetPercentageY) {
        this.offsetPercentageY = offsetPercentageY;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

        
}
