import { Injectable } from '@angular/core';
import { Ingredient } from '../models/ingredient.model';
import { HttpClient } from '@angular/common/http';
import { Subject } from 'rxjs';
import { environment } from '../environments/enviroment';
const base_url = environment.base;
@Injectable({
  providedIn: 'root',
})
export class IngredientService {
  private url = `${base_url}/api`;
  private listaCambio = new Subject<Ingredient[]>();
  constructor(private http: HttpClient) {}
  list() {
    return this.http.get<Ingredient[]>(this.url);
  }

  insert(i: Ingredient) {
    return this.http.post(this.url, i);
  }
  setList(listaNueva: Ingredient[]) {
    this.listaCambio.next(listaNueva);
  }
  getList() {
    return this.listaCambio.asObservable()
  }
}
