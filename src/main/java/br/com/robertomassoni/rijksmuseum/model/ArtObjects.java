package br.com.robertomassoni.rijksmuseum.model;

public class ArtObjects {
    private String id;
    private String objectNumber;
    private String title;
    private boolean hasImage;
    private String principalOrFirstMaker;
    private String longTitle;
    private boolean showImage;
    private boolean downloadAllowed;
    private WebImage webImage;
    private Images images;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectNumber() {
        return objectNumber;
    }

    public void setObjectNumber(String objectNumber) {
        this.objectNumber = objectNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isHasImage() {
        return hasImage;
    }

    public void setHasImage(boolean hasImage) {
        this.hasImage = hasImage;
    }

    public String getPrincipalOrFirstMaker() {
        return principalOrFirstMaker;
    }

    public void setPrincipalOrFirstMaker(String principalOrFirstMaker) {
        this.principalOrFirstMaker = principalOrFirstMaker;
    }

    public String getLongTitle() {
        return longTitle;
    }

    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }

    public boolean isShowImage() {
        return showImage;
    }

    public void setShowImage(boolean showImage) {
        this.showImage = showImage;
    }

    public boolean isDownloadAllowed() {
        return downloadAllowed;
    }

    public void setDownloadAllowed(boolean downloadAllowed) {
        this.downloadAllowed = downloadAllowed;
    }

    public WebImage getWebImage() {
        return webImage;
    }

    public void setWebImage(WebImage webImage) {
        this.webImage = webImage;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }
    
    
}
