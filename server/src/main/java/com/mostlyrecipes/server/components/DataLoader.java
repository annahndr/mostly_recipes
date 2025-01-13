package com.mostlyrecipes.server.components;

import com.mostlyrecipes.server.models.Recipe;
import com.mostlyrecipes.server.models.User;
import com.mostlyrecipes.server.services.RecipeService;
import com.mostlyrecipes.server.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    RecipeService recipeService;

    @Autowired
    UserService userService;

    public void run(ApplicationArguments args) throws Exception {

//        USERS

        User anna = new User("Anna", "Henderson", "anna@mail.com", "hello123Y^");
        userService.saveUser(anna);

        User nigella = new User("Nigella", "Lawson", "nigella@nigella.com", "vermouth123L*");
        userService.saveUser(nigella);

        User mary = new User("Mary", "Berry", "mary@berry.com", "butter456T&");
        userService.saveUser(mary);

        User jamie = new User("Jamie", "Oliver", "jamie@oliver.com", "oliveoil456J%");
        userService.saveUser(jamie);

//        RECIPES

        Recipe gingerbread = new Recipe("Gingerbread", "Old-fashioned, sticky gingerbread", 6, Arrays.asList("300g Plain Flour", "4 large eggs", "2tbsp ground ginger", "200g butter", "250g sugar"), Arrays.asList("Cream together softened butter", "Add eggs one at a time with a spoonful of flour", "mix ginger with remaining flour and add to mixture", "pour into a lined tin and bake at 190deg for 40mins"), "Best served warm. Keeps in an airtight tin for 5 days", mary);
        recipeService.saveRecipe(gingerbread);

        Recipe marsalaChicken = new Recipe("Marsala Chicken", "Long bake time, but easy to put together.", 4, Arrays.asList("500g chicken thigh fillets", "bunch of grapes", "250ml marsala wine", "20g butter", "1 tbsp olive oil"), Arrays.asList("Brown the chicken in the olive oil and butter", "Add the other ingredients and put in 150deg oven for 45mins with the lid on", "remove lid, turn oven up to 190deg and let brown and sauce thicken for another 20mins"), "", nigella);
        recipeService.saveRecipe(marsalaChicken);

        Recipe roastChicken = new Recipe("Best Ever Roast Chicken", "Perfect for Sunday lunch", 6, Arrays.asList("1 large free range chicken", "100g butter", "1 lemon", "a few sprigs of thyme leaves", "150ml white wine"), Arrays.asList("Cut lemon in half and place in chicken cavity", "season chicken with salt and pepper and place in casserole dish/roasting tin", "slide butter and herbs under skin of the chicken breast and pour over wine", "put in 150deg oven with lid on for 45mins", "remove lid, turn heat up to 200deg and roast for another 30minutes or until juices run clear"), "leave to rest with lid on for at least 20 minutes", jamie);
        recipeService.saveRecipe(roastChicken);

    }

}
