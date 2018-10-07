package com.octaopdemo.aopdemooct.MyImpl;

import com.octaopdemo.aopdemooct.repository.MyRepo;
import org.springframework.stereotype.Service;

/**
 * Created by abhi on 07/10/18.
 */

@Service
public class MyImplClass implements MyRepo {

    @Override
    public void add() {
        System.out.println("Hi hello");
    }
}
