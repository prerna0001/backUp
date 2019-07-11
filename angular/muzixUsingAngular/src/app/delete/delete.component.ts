import { Component, OnInit } from '@angular/core';
import { MusixService } from '../musix.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-delete',
  templateUrl: './delete.component.html',
  styleUrls: ['./delete.component.css']
})
export class DeleteComponent implements OnInit {

  constructor(private musixService:MusixService, private route:ActivatedRoute, private router:Router) { }

  ngOnInit() {
    this.deleteMusic();
  }

  deleteMusic():any
  {
    console.log("delete working");
    const id=this.route.snapshot.paramMap.get('name');
    console.log("deleted");
    this.musixService.deleteFromWishList(id);
    this.router.navigateByUrl('/wish');
  } 

  
}
