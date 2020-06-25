package Boat.Controller;

import Boat.Model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AccountController {
    @GetMapping("")
    public String showForm(Model model){
        model.addAttribute("acc",new Account());
        return "index";
    }
    @PostMapping("/vkl")
    public ModelAndView create(@Validated@ModelAttribute Account account, BindingResult br){
        if(br.hasFieldErrors())
            return new ModelAndView("index","acc",new Account());
        else
            return new ModelAndView("result");
    }
}
