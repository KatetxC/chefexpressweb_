import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { RouterLink } from '@angular/router';
import { Router } from '@angular/router';
import { Recipe } from '../../../models/recipe.model';
import { Ingredient } from '../../../models/ingredient.model';
import { RecipeService } from '../../../services/recipe.service';
import { IngredientService } from '../../../services/ingredient.service';

@Component({
  selector: 'app-registrarrecipe',
  standalone: true,
  imports: [MatButtonModule, MatSelectModule, MatFormFieldModule, CommonModule, RouterLink, ReactiveFormsModule, MatInputModule],
  templateUrl: './registrarrecipe.component.html',
  styleUrl: './registrarrecipe.component.css'
})
export class RegistrarrecipeComponent {
  form: FormGroup = new FormGroup({});
  recipe: Recipe = new Recipe();
  listaIngredientes: Ingredient[] = [];
  constructor(
    private rS: RecipeService,
    private router: Router,
    private formBuilder: FormBuilder,
    private iS: IngredientService
  ) {}

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      c1: ['', Validators.required],
      c2: ['', Validators.required],
      c3: ['', Validators.required],
      c4: ['', Validators.required],
    });
    this.iS.list().subscribe((data) => {
      this.listaIngredientes = data;
    });
  }
  aceptar(): void {
    if (this.form.valid) {
      this.recipe.ingredient.description = this.form.value.c1;
      this.recipe.name = this.form.value.c2;
      this.recipe.description = this.form.value.c3;
      this.recipe.instructions = this.form.value.c4;

      this.rS.insert(this.recipe).subscribe((data) => {
        this.rS.list().subscribe((data) => {
          this.rS.setList(data);
        });
      });

      this.router.navigate(['recipe']);
    }
  }
}
