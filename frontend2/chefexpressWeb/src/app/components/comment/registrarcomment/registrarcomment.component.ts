import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatSelectModule } from '@angular/material/select';
import { Router, RouterLink } from '@angular/router';
import { Comment } from '../../../models/comment.model';
import { Recipe } from '../../../models/recipe.model';
import { CommentService } from '../../../services/comment.service';
import { RecipeService } from '../../../services/recipe.service';
import { Ingredient } from '../../../models/ingredient.model';
import { IngredientService } from '../../../services/ingredient.service';
@Component({
  selector: 'app-registrarcomment',
  standalone: true,
  imports: [MatButtonModule, MatSelectModule, MatFormFieldModule, CommonModule, RouterLink, ReactiveFormsModule, MatInputModule],
  templateUrl: './registrarcomment.component.html',
  styleUrl: './registrarcomment.component.css'
})
export class RegistrarcommentComponent {
  form: FormGroup = new FormGroup({});
  comment: Comment = new Comment();
  listaRecipes: Recipe[] = [];
  constructor(
    private coS: CommentService,
    private router: Router,
    private formBuilder: FormBuilder,
    private rS: RecipeService
  ) {}

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      c1: ['', Validators.required],
      c2: ['', Validators.required],
      c3: ['', Validators.required],
    });
    this.rS.list().subscribe((data) => {
      this.listaRecipes = data;
    });
  }
  aceptar(): void {
    if (this.form.valid) {
      this.comment.recipe.idRecipe = this.form.value.c1;
      this.comment.calification = this.form.value.c2;
      this.comment.text = this.form.value.c3;
      this.coS.insert(this.comment).subscribe((data) => {
        this.coS.list().subscribe((data) => {
          this.coS.setList(data);
        });
      });

      this.router.navigate(['comment']);
    }
  }
}