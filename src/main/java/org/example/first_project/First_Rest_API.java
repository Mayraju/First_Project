package org.example.first_project;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class First_Rest_API {

    @RequestMapping("/hello/{name}")
    public String setName(@PathVariable String name){
        return "First Rest API  "+ name;
    }

    @RequestMapping("/printName/{name}/{id}")
    public String printName(@PathVariable String name, @PathVariable int id){
        StringBuilder str= new StringBuilder();
        for(int i=0;i<id;i++){
            str.append(name).append(i + 1);
            str.append("\n");
        }
        return str.toString();
    }
}