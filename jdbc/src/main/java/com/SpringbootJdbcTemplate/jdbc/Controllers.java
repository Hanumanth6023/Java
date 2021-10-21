package com.SpringbootJdbcTemplate.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Controllers {
    @Autowired
    Demo demo;
    @GetMapping(value ="/home")
    public String index(){
        return "demo.jsp";
    }
        @GetMapping(value = "/studentnames")
        public List<String> studentnames() {
        return demo.getallStudentnames();


    }

    //username,password
    //username and password is inside the database

    @PostMapping(value="/login")
    public String Login(@RequestBody Login login){
        System.out.println(login.username);
        System.out.println(login.password);
        return "login is done";
    }

    @GetMapping(value="params")
    public String params(@RequestParam("raj") String name){
        return "hellow" + name;
    }


}
