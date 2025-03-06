import NewRecipeForm from "../components/NewRecipeForm";
import Search from "../components/Search";
import RecipeList from "../components/RecipeList";
import styles from './RecipeContainer.module.css'
import type { Recipe } from '../types/Recipe';
import { useState, useEffect } from 'react';

export default function RecipeContainer(){

    const [recipes, setRecipes] = useState<Recipe[]>([]);
    const [loading, setLoading] = useState<boolean>(false);
    const [error, setError] = useState<string | null>(null); // state for error handling

// Async function to fetch recipes
const fetchRecipes = async() : Promise<Recipe[]> => {
    const response = await fetch('http://localhost:8080/recipes')
    if (!response.ok) {
        throw new Error('Failed to fetch recipes');
    }
    return await response.json();
};

useEffect(() => {
    const loadRecipes = async () => {
        setLoading(true);
        try {
            const fetchedRecipes = await fetchRecipes();
            setRecipes(fetchedRecipes);
        } catch (error: any) {
            setError(error.message);
        }finally {
            setLoading(false);
        }
    };

    loadRecipes();
}, [])


return (
    <div className={styles.container}>
        <div className={styles.left}>
            <Search />
            <RecipeList recipes={recipes}/>
        </div>
        <div className={styles.right}>
            <NewRecipeForm />
        </div>
    </div>
   
);

}