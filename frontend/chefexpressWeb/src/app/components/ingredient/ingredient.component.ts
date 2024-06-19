import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, RouterOutlet } from '@angular/router';
import { ListaringredientComponent } from './listar/listar.component';

@Component({
  selector: 'app-ingredient',
  standalone: true,
  imports: [RouterOutlet,ListaringredientComponent],
  templateUrl: './ingredient.component.html',
  styleUrl: './ingredient.component.css',
})
export class IngredientComponent implements OnInit{
  constructor(public route:ActivatedRoute) {}
 ngOnInit(): void {
     
 }
}
