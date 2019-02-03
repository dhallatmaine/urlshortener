package shorturl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;


@Controller
public class ShortenedURLController {

  @Autowired
  ShortenService shortenService;

  @GetMapping("/")
  public String getIndexPage(Model model) {
    model.addAttribute("shortURLRequest", new ShortURLRequest());
    return "url";
  }

  @GetMapping("/{url}")
  public ModelAndView url(@PathVariable(name="url") String url, Model model) {
    Optional<ShortURL> shortURL = shortenService.getOriginalURL(url);
    if (!shortURL.isPresent()) {
      model.addAttribute("shortURLRequest", new ShortURLRequest());
      model.addAttribute("error", "Could not find link");
      return new ModelAndView("url");
    } else {
      return new ModelAndView("redirect:" + shortURL.get().getOriginalURL());
    }
  }

  @PostMapping(path = "/shorten")
  public String getShortURL(@ModelAttribute ShortURLRequest request, Model model) {
    ShortURL shortURL = new ShortURL()
      .setOriginalURL(request.getUrl())
      .setId(shortenService.generateLink());

    shortenService.save(shortURL);

    model.addAttribute("originalURL", shortURL.getOriginalURL());
    model.addAttribute("shortenedURL", shortURL.getId());
    return "shortened";
  }

}
