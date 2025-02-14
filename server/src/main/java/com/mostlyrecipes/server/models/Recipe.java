package com.mostlyrecipes.server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column(name = "number_of_servings")
    private int numberOfServings;

    @ElementCollection
    @CollectionTable(name = "recipe_ingredients", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column
    private List<String> ingredients;

    @ElementCollection
    @CollectionTable(name = "recipe_method_steps", joinColumns = @JoinColumn(name = "recipe_id"))
    @Column
    private List<String> methodSteps;

    private String notes;

//    Many recipes have one user
    @ManyToOne
    @JsonIgnoreProperties({"recipes"})
    @JoinColumn(name = "user_id", nullable = false) // every recipe must have a user
    private User user;

    public Recipe(String title, String description, int numberOfServings, List<String> ingredients, List<String> methodSteps, String notes, User user) {
        this.title = title;
        this.description = description;
        this.numberOfServings = numberOfServings;
        this.ingredients = ingredients;
        this.methodSteps = methodSteps;
        this.notes = notes;
        this.user = user;
    }

    public Recipe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
