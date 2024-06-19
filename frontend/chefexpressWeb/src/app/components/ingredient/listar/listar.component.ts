import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { IngredientService } from '../../../services/ingredient.service';
import { Ingredient } from '../../../models/ingredient.model';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';


@Component({
  selector: 'app-listaringredient',
  standalone: true,
  imports: [MatTableModule, MatPaginatorModule],
  templateUrl: './listar.component.html',
  styleUrl: './listar.component.css'
})
export class ListaringredientComponent implements OnInit {
  displayedColumns: string[] = ['codigo', 'descripcion'];
  dataSource: MatTableDataSource<Ingredient> = new MatTableDataSource();
  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;
  constructor(private iS: IngredientService) {}
  ngOnInit(): void {
    this.iS.list().subscribe((data) => {
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.paginator = this.paginator;
    });
    this.iS.getList().subscribe((data)=>{
      this.dataSource=new MatTableDataSource(data)
      this.dataSource.paginator = this.paginator;
    })
  }
}
