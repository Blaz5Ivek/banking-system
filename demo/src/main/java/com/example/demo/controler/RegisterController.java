package com.example.demo.controler;

import com.example.demo.model.form.formUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class RegisterController {
    @GetMapping("/registerHTML")
    public String GetRegister(Model model){
        model.addAttribute("formUser",new formUser());
        log.info("Registracija korisnika");
        return "/register";
    }

    @PostMapping("/registerHTML")
    public String HandleRegister(@ModelAttribute("formUser") formUser formUser){
        log.info(formUser.getEmail());
        return "/registerSuccess";
    }
}
