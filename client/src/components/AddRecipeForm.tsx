export default function AddRecipeForm(){
    return (
        <form action="">
           <h4>Add a Recipe</h4> 

           <label htmlFor="title">Recipe Title</label>
           <input type="text" placeholder="Give your recipe a title" />

           <label htmlFor="description">Description</label>
           <textarea name="description" rows="4" cols="50" id="description" placeholder="share the story behind your recipe and what makes it special"></textarea>

           <label htmlFor="servings">Servings</label>
           <input type="text" id="servings"/>

            <h5>Ingredients</h5>
            <p>Enter one ingredient per line. Include the quantity (i.e. cups, tablespoons) and any special preparation (i.e. sifted, softened, chopped).</p>

            <input type="text" placeholder="e.g. 300g plain flour, sifted" />
            <input type="text" placeholder="e.g. 1 cup sugar"/>
            <input type="text" placeholder="e.g. 200g butter, softened" />

            <button>Add Ingredient</button>

            <h5>Method</h5>
            <p>Explain how to make your recipe, including oven temperatures, baking or cooking times, pan sizes, etc. Enter directions below.</p>
            
            <label htmlFor="">Step 1</label>
            <input type="text" />
            
            <label htmlFor="">Step 2</label>
            <input type="text" />
            
            <label htmlFor="">Step 3</label>
            <input type="text" />

            <button>Add Step</button>

            <h5>Notes (optional)</h5>
            <p>Add any helpful tips about ingredient substitutions, servings or storage here</p>
            <input type="text" />


        </form>
    );
}