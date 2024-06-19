import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatSelectModule } from '@angular/material/select';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { Ingredient } from '../../../models/ingredient.model';
import { IngredientService } from '../../../services/ingredient.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-registrar',
  standalone: true,
  imports: [ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    CommonModule,
    MatSelectModule,
    MatNativeDateModule,
    MatButtonModule,
  ],
  templateUrl: './registrar.component.html',
  styleUrl: './registrar.component.css'
})
export class RegistrarComponent implements OnInit {
  form: FormGroup = new FormGroup({});
  i: Ingredient = new Ingredient();

  constructor(
    private formBuilder: FormBuilder,
    private iS: IngredientService,
    private router: Router
  ) {}
  ngOnInit(): void {
    this.form = this.formBuilder.group({
      description: ['', Validators.required],
    });
  }
  registrar(): void {
    if (this.form.valid) {
      this.i.description = this.form.value.description;
      this.iS.insert(this.i).subscribe((data) => {
        this.iS.list().subscribe((data) => {
          this.iS.setList(data);
        });
      });
      this.router.navigate(['unidades']);
    }
  }
}