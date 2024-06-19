import { Component, OnInit, ViewChild } from '@angular/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { Recipe } from '../../../models/recipe.model';
import { RecipeService } from '../../../services/recipe.service';

@Component({
  selector: 'app-listarrecipe',
  standalone: true,
  imports: [MatTableModule, MatFormFieldModule, MatPaginatorModule],
  templateUrl: './listarrecipe.component.html',
  styleUrl: './listarrecipe.component.css'
})
export class ListarrecipeComponent implements OnInit{
  dataSource: MatTableDataSource<Recipe> = new MatTableDataSource();
  displayedColumns: string[] = ['c1', 'c2', 'c3', 'c4'];
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private rS: RecipeService) {}
  ngOnInit(): void {
    this.rS.list().subscribe((data) => {
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.paginator = this.paginator;
    });
    this.rS.getList().subscribe((data) => {
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.paginator = this.paginator;
    });
  }
}

  