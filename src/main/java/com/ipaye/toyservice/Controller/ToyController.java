package com.ipaye.toyservice.Controller;


import com.ipaye.toyservice.Model.Toy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/toys")
public class ToyController {


    private List<Toy> toys = new ArrayList<>();

    @PostMapping
    public void addToy(@RequestBody Toy toy){

        toys.add(toy);

    }

    @GetMapping
    public List<Toy> listToys(){
        return toys;
    }




}
