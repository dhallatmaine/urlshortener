package shorturl;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShortenedURLController {

  @GetMapping("/")
  public String getIndexPage(Model model) {
    model.addAttribute("shortURLRequest", new ShortURLRequest());
    return "url";
  }

  @GetMapping("/{url}")
  public ModelAndView url(@PathVariable(name="url") String url) {
    // lookup url
    return new ModelAndView("redirect:https://www.google.com");
  }

  @PostMapping(path = "/shorten")
  public String getShortURL(@ModelAttribute ShortURLRequest request, Model model) {
    double random = Math.random() * 100000000;
    String url = DigestUtils.md5Hex(Double.toString(random)).substring(0, 6);

    model.addAttribute("originalURL", request.getUrl());
    model.addAttribute("shortenedURL", url);
    return "shortened";
  }

}
