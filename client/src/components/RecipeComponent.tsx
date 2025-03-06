import type { Recipe } from '../types/Recipe';

export default function RecipeComponent( { recipe } : {recipe: Recipe} ){

    return(
        <div>
            <h2>{ recipe.title }</h2>
            <p>{ recipe.description }</p>
        </div>
    )

}