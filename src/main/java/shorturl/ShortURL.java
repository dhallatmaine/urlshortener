package shorturl;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("ShortURL")
public class ShortURL implements Serializable {

  private String id;
  private String originalURL;

  public ShortURL() { }

  public String getId() {
    return id;
  }

  public ShortURL setId(String id) {
    this.id = id;
    return this;
  }

  public String getOriginalURL() {
    return originalURL;
  }

  public ShortURL setOriginalURL(String originalURL) {
    this.originalURL = originalURL;
    return this;
  }

}
