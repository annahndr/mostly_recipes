package com.mostlyrecipes.server.controllers;

import com.mostlyrecipes.server.models.Recipe;
import com.mostlyrecipes.server.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recipes")
public class RecipeController {

@Autowired
RecipeService recipeService;

//    INDEX
    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        return new ResponseEntity<>(recipeService.getAllRecipes(), HttpStatus.OK);
    }
}
