import { Component, OnInit, ViewChild } from '@angular/core';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatPaginator, MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource, MatTableModule } from '@angular/material/table';
import { CommentService } from '../../../services/comment.service';
import { Comment } from '../../../models/comment.model';

@Component({
  selector: 'app-listarcomment',
  standalone: true,
  imports: [MatTableModule, MatFormFieldModule, MatPaginatorModule, MatIconModule],
  templateUrl: './listarcomment.component.html',
  styleUrl: './listarcomment.component.css'
})
export class ListarcommentComponent implements OnInit{
  dataSource: MatTableDataSource<Comment> = new MatTableDataSource();
  displayedColumns: string[] = ['c1', 'c2', 'c3', 'c4'];
  @ViewChild(MatPaginator) paginator!: MatPaginator;

  constructor(private cS: CommentService) {}
  ngOnInit(): void {
    this.cS.list().subscribe((data) => {
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.paginator = this.paginator;
    });
    this.cS.getList().subscribe((data) => {
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.paginator = this.paginator;
    });
  }
  
}
