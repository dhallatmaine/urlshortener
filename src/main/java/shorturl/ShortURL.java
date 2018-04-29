package shorturl;

public class ShortURL {

  private String originalURL;
  private String shortenedLink;

  public ShortURL() { }

  public String getOriginalURL() {
    return originalURL;
  }

  public void setOriginalURL(String originalURL) {
    this.originalURL = originalURL;
  }

  public String getShortenedLink() {
    return shortenedLink;
  }

  public void setShortenedLink(String shortenedLink) {
    this.shortenedLink = shortenedLink;
  }

}
