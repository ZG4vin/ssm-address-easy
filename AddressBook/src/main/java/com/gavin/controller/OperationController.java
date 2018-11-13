package com.gavin.controller;

import com.gavin.domain.Person;
import com.gavin.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/operation")
public class OperationController {

    @Autowired
    private PersonService personService;

    /**
     * 添加、修改的方法
     * @param person
     * @return
     */
    @GetMapping("/add")
    @ResponseBody
    public String add(Person person){
        if (person.getId()==null){ //添加
            personService.addPerson(person);
        }else{  //修改
            personService.editPersonById(person);
        }
        return "OK";
    }

    /**
     * 删除的方法
     * @param id
     * @return
     */
    @GetMapping("/delete")
    @ResponseBody
    public String del(int id){
        personService.deletePerson(id);
        return "ok";
    }


    @GetMapping("/toEdit")
    @ResponseBody
    public Person edit(Person person){
        Person p = personService.findPersonById(person.getId());
        return p;
    }
}
