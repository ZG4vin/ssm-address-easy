package com.gavin.controller;

import com.gavin.domain.Person;
import com.gavin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestContextHolder;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private PersonService personService;

    @RequestMapping
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/toIndex")
    public String toIndex(String username, String password, Model model,HttpSession session){
        if ("123".equals(password) && "admin".equals(username)){
            List<Person> personList = personService.findAllPerson();
            model.addAttribute("personList",personList);
            session.setAttribute("username",username);
            return "index";
        }else{
            return "redirect:/login";
        }
    }
}
