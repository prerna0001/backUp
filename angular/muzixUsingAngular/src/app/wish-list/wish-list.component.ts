import { Component, OnInit } from '@angular/core';
import { MusixService } from '../musix.service';
import { ActivatedRoute, Router } from '@angular/router';


@Component({
  selector: 'app-wish-list',
  templateUrl: './wish-list.component.html',
  styleUrls: ['./wish-list.component.css']
})
export class WishListComponent implements OnInit {


  constructor(private musixService:MusixService, private route: ActivatedRoute,private router:Router) { }
  arrayOfMusic:any=[];

  ngOnInit() {
    this.musixService.displayWishList().subscribe(data=>
      {
       console.log(data)
       this.arrayOfMusic=data;
    });
  }
  
  deleteMusic(value)
  {
    console.log("in Delete method");
    var id=value.trackId;
    this.router.navigateByUrl("/delete/" +id);

  }

  detailMusic(value)
  {
   
    console.log("in detail method",value);
    var artist=value.artist.name; //because our musix spring boot application has comment as third field
    var album=value.name;
   
    console.log(artist,album);
    this.router.navigateByUrl("/detail/"+artist+ "/"+album);
  }

 



}
