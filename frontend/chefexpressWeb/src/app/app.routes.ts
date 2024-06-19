import { Routes } from '@angular/router';
import { IngredientComponent } from './components/ingredient/ingredient.component';
import { RegistrarComponent } from './components/ingredient/registrar/registrar.component';
import { AboutComponent } from './components/about/about.component';
import { LoginComponent } from './components/login/login.component';
import { PrincipalComponent } from './components/principal/principal.component';
import { RecipeComponent } from './components/recipe/recipe.component';
import { RegistrarrecipeComponent } from './components/recipe/registrarrecipe/registrarrecipe.component';

export const routes: Routes = [
    {
      path: 'unidades',
      component: IngredientComponent,
      children: [
        {
          path: 'nuevo',
          component: RegistrarComponent
        }
      ]
    },
    {
      path: 'about',
      component: AboutComponent
    },
    {
      path: 'login',
      component: LoginComponent
    },
    {
      path: 'principal',
      component: PrincipalComponent
    },
    {
      path: 'recipe',
      component: RecipeComponent,
      children: [{ path: 'nuevo', component: RegistrarrecipeComponent }],
    },
  ];