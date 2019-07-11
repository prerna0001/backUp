import { Component, OnInit } from '@angular/core';
import { MusixService } from '../musix.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private musixService:MusixService ,private route :Router) { }

  arrayOfMusic:any=[];

  ngOnInit() {
      this.musixService.getTrendMusic().subscribe(data=>
        {
            console.log(data.tracks.track);
            this.arrayOfMusic=data.tracks.track;
        });
  }
  click(value){
   
    this.route.navigateByUrl("/result/"+value);
    console.log("This Works");  
  }

  addToWish(value) {
    console.log("in addtowish" + value.artist.name);
    let myMusic = {
      trackId:  value.listeners,
      trackName: value.name,
      comments:value.artist.name
    }
    this.musixService.addToWishList(myMusic);
  }

  displayWishList()
  {
    console.log("displaying wishlist");
    this.arrayOfMusic.track;
  }



  detailMusic(value)
  {
   
    console.log("in detail method",value);
    var artist=value.artist.name; //because our musix spring boot application has comment as third field
    var album=value.name;
   
    console.log(artist,album);
    // var id =value.trackId;
    this.route.navigateByUrl("/detail/"+artist+ "/"+album);
  }
}
