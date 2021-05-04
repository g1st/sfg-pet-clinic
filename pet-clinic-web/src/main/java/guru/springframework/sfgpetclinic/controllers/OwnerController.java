package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gs on 04/05/2021.
 **/
@Controller
@RequestMapping("/owners")
public class OwnerController {

    @GetMapping({"/", "", "/index", "/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}
