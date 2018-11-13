package com.gavin.controller;

import com.gavin.dao.PersonDao;
import com.gavin.domain.Person;
import com.gavin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private PersonService personService;

    /**
     * 跳转到查询页
     * @param model
     * @return
     */
    @GetMapping("/toFind")
    public String toFindPage(Model model){
        List<Person> personList = personService.findAllPerson();
        model.addAttribute("personList",personList);
        return "find";
    }

    @GetMapping("/toAdd")
    public String toAddPage(){
        return "add";
    }
}
