import { Ingredient } from "./ingredient.model"

export class Recipe {
     id:number =0
     name:string=""
     description:string=""
     instructions:string=""
     ingredients:Ingredient=new Ingredient()
}
