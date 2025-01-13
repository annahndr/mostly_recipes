package com.mostlyrecipes.server.repositories;

import com.mostlyrecipes.server.models.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
