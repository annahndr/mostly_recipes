package com.mostlyrecipes.server.models;

import java.util.List;

public class RecipeDTO {

    private String title;

    private String description;

    private int numberOfServings;

    private List<String> ingredients;

    private List<String> methodSteps;

    private String notes;

    private Long userId;

    public RecipeDTO(String title, String description, int numberOfServings, List<String> ingredients, List<String> methodSteps, String notes, Long userId) {
        this.title = title;
        this.description = description;
        this.numberOfServings = numberOfServings;
        this.ingredients = ingredients;
        this.methodSteps = methodSteps;
        this.notes = notes;
        this.userId = userId;
    }

    public RecipeDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfServings() {
        return numberOfServings;
    }

    public void setNumberOfServings(int numberOfServings) {
        this.numberOfServings = numberOfServings;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getMethodSteps() {
        return methodSteps;
    }

    public void setMethodSteps(List<String> methodSteps) {
        this.methodSteps = methodSteps;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
