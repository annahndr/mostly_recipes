export interface Recipe {
    id: number;
    title: string;
    description: string;
    numberOfServings: number;
    ingredients: string[];
    methodSteps: string[];
    notes: string;
}