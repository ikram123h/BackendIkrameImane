package com.example.beautyprojectback.RestControllers;

import com.example.beautyprojectback.entities.Category;
import com.example.beautyprojectback.entities.Parfum;
import com.example.beautyprojectback.services.CategoryService;
import com.example.beautyprojectback.services.ParfumService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class ParfumController {
    @Autowired
    CategoryService categoryService;
    @Autowired
    ParfumService parfumService;


    @PostMapping("/saveParfum")
    public Parfum saveParfum( @RequestBody Parfum parfum, @RequestParam("idcat") Long id) {

        Category cat=categoryService.getCategory(id);
        parfum.save(cat);
        return parfumService.saveParfum(parfum);

    }
    @GetMapping("/parfumsList")
    public List<Parfum> ParfumList(){
        return parfumService.getAllParfums();
    }

    @GetMapping("/deleteParfum")
    public void DeleteParfum(@RequestParam("id") Long id){
         parfumService.deleteParfumById(id);

    }

    @GetMapping("/showParfum")
    public Parfum showParfum(@RequestParam("id") Long id){
           return parfumService.getParfum(id);
    }


    @PostMapping("/updateParfum")
    public Parfum updateParfum(
            @RequestBody Parfum parfum){
        return parfumService.saveParfum(parfum);

    }}
