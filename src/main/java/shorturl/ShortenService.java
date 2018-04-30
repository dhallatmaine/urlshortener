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
    String random1 = Double.toString(Math.random() * 100000000);
    String random2 = Double.toString(Math.random() * 100000000);
    String random3 = Double.toString(Math.random() * 100000000);
    String random4 = Double.toString(Math.random() * 100000000);
    String random5 = Double.toString(Math.random() * 100000000);
    return DigestUtils.md5Hex(random1 + random2 + random3 + random4 + random5).substring(0, 7);
  }

}
