package com.mostlyrecipes.server.services;

import com.mostlyrecipes.server.models.Recipe;
import com.mostlyrecipes.server.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

    @Autowired
    RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes(){
        return recipeRepository.findAll();
    }

    public void saveRecipe(Recipe recipe){
        recipeRepository.save(recipe);
    }
}
