import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterOutlet } from '@angular/router';
import { ListarrecipeComponent } from './listarrecipe/listarrecipe.component';

@Component({
  selector: 'app-recipe',
  standalone: true,
  imports: [RouterOutlet, ListarrecipeComponent],
  templateUrl: './recipe.component.html',
  styleUrl: './recipe.component.css'
})
export class RecipeComponent implements OnInit{
  constructor(public route: ActivatedRoute) {}
  ngOnInit(): void {}
}
