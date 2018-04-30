package shorturl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class ShortenService {

  @Autowired
  ShortURLRepository shortURLRepository;

  public void save(ShortURL shortURL) {
    shortURLRepository.save(shortURL);
  }

  public ShortURL getOriginalURL(String shortenedLink) {
    return shortURLRepository.findById(shortenedLink).get();
  }

  public String generateLink() {
    double random = Math.random() * 100000000;
    return DigestUtils.md5Hex(Double.toString(random)).substring(0, 7);
  }

}
