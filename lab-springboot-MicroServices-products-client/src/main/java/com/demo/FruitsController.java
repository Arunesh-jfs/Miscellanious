package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")

public class FruitsController {
//    @GetMapping("/product")
//    public Product product() {
//        return new Product("P01", "Power of Now");
//    }
	
	
    @GetMapping("/fruits")
    
    public List getFruits() {
    	List fruitsList = new ArrayList<Fruits>();
        fruitsList.add(new Fruits("f01", "Orange"));
        fruitsList.add(new Fruits("f02", "Apple"));
        fruitsList.add(new Fruits("f03", "Pineapple"));
        
        return fruitsList;
    }
}