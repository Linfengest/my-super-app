package com.controller;

import com.entity.Data1;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/data")
public class DataController {

    @RequestMapping(value = "/see",method = {RequestMethod.GET})
    public String see() {

        return "来这see";
    }
    
    @RequestMapping(value = "/see1",method = {RequestMethod.GET})
    public String see1() {
        Data1 data = new Data1();
        data.setId(1);
        data.setName("zheshi1");
        data.setExplain("对1的描述");
        return data.toString();
    }

}
