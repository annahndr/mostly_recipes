import type { Recipe } from '../types/Recipe';
import RecipeComponent from './RecipeComponent';

export default function RecipeList({ recipes }: { recipes : Recipe[] }){

    const recipesList = recipes.map((recipe) => {
        return <RecipeComponent key={recipe.id} recipe={recipe} />
    })

    return(
        <div>
            {recipesList}
        </div>
    )
}
