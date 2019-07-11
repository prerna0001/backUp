import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-department-list',
  template: `
    <p>
      department-list works!
    </p>
    <div (click)="onSelect(department)" *ngFor="let d of departments">
      {{d.id}} - {{d.name}}
    </div>
  `,
  styles: []
})
export class DepartmentListComponent implements OnInit {

  departments=[
    {"id":1, "name":"a"},
    {"id":2, "name":"b"},
    {"id":3, "name":"c"},
    {"id":4, "name":"d"},
    {"id":5, "name":"e"}
  ]
  constructor(private router: Router) { }

  onSelect(department){
    this.router.navigate(['/department',department.id]);
  }


  ngOnInit() {
  }

}
