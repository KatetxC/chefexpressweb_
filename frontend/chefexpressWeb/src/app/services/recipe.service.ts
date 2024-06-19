import { Injectable } from '@angular/core';
import { Recipe } from '../models/recipe.model';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs';
import { environment } from '../environments/enviroment';
const base_url = environment.base;

@Injectable({
  providedIn: 'root'
})
export class RecipeService {
  private url = `${base_url}/apirecipe`;
  private listaCambio = new Subject<Recipe[]>();
  constructor(private httpClient: HttpClient) {}
  list() {
    return this.httpClient.get<Recipe[]>(this.url);
  }
  insert(p: Recipe) {
    return this.httpClient.post(this.url, p);
  }
  setList(listaNueva: Recipe[]) {
    this.listaCambio.next(listaNueva);
  }
  getList() {
    return this.listaCambio.asObservable();
  }
} 