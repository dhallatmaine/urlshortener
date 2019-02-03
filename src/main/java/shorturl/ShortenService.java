package shorturl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class ShortenService {

  @Autowired
  ShortURLRepository shortURLRepository;

  public void save(ShortURL shortURL) {
    shortURLRepository.save(shortURL);
  }

  public Optional<ShortURL> getOriginalURL(String shortenedLink) {
    return shortURLRepository.findById(shortenedLink);
  }

  public String generateLink() {
    String hash = DigestUtils.md5Hex(LocalDateTime.now().toString());
    return hash.substring(hash.length() - 7);
  }

}
