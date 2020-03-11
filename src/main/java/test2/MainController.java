package test2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/download", method = RequestMethod.POST)
    public String download(@RequestParam("email") String email) {
        LOGGER.info("========> Получили " + email + " <========");
        return "index";
    }

}
