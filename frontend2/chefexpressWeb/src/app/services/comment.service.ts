import { Injectable } from '@angular/core';
import { Comment } from '../models/comment.model';
import { HttpClient } from '@angular/common/http';
import { environment } from '../environments/enviroment';
import { Subject } from 'rxjs';
const base_url = environment.base;
@Injectable({
  providedIn: 'root'
})
export class CommentService {
  private url = `${base_url}/apicomment`;
  private listaCambio = new Subject<Comment[]>();
  constructor(private http: HttpClient) {}
  list() {
    return this.http.get<Comment[]>(this.url);
  }
  insert(c: Comment) {
    return this.http.post(this.url, c);
  }
  setList(listaNueva: Comment[]) {
    this.listaCambio.next(listaNueva);
  }
  getList() {
    return this.listaCambio.asObservable();
  }
}
