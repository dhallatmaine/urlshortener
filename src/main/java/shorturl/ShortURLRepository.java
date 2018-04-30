package shorturl;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShortURLRepository extends CrudRepository<ShortURL, String> {

  ShortURL getByShortenedLink(String shortenedLink);

}