package loc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @RequestMapping("/user")
  public User user(@RequestParam(value = "id", defaultValue = "65165165") String id) {
    return new User(65165165, "groupe 93", "immeuble des sablons", "André", "Martin", "01.75.45.78.15",
        "06.87.51.48.53", "andre.martin@gmail.com");
  }
}
