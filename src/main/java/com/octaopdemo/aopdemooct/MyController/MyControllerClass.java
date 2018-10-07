package com.octaopdemo.aopdemooct.MyController;

import com.octaopdemo.aopdemooct.MyImpl.MyImplClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 07/10/18.
 */

@RestController
public class MyControllerClass {

    @Autowired
    private MyImplClass myImplClass;

    @GetMapping(value="/showdata")
    public String getData(){

        myImplClass.add();
        return "done";
    }
}
