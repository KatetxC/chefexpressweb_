import { Ingredient } from './ingredient.model'

export class Recipe {
     idRecipe:number =0
     name:string=""
     description:string=""
     instructions:string=""
     ingredient:Ingredient=new Ingredient()
}
