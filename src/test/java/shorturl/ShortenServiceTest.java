package shorturl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ShortenServiceTest {

  ShortenService shortenService = new ShortenService();

  @Test
  public void generateLink() {
    String link = shortenService.generateLink();
    assertNotNull(link);
    assertEquals(7, link.length());
  }

}
