package shorturl;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("ShortURL")
public class ShortURL implements Serializable {

  private String id;
  private String originalURL;
  private String shortenedLink;

  public ShortURL() { }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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
