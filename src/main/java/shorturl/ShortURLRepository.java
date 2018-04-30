package shorturl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortURLRepository extends JpaRepository<ShortURL, Long> {

  ShortURL getByShortenedLink(String shortenedLink);

}