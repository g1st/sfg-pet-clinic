package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gs on 04/05/2021.
 **/
@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String index(){


        return "index";
    }

}
