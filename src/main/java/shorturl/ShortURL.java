package shorturl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShortURL {

  private Long id;
  private String originalURL;
  private String shortenedLink;

  public ShortURL() { }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
