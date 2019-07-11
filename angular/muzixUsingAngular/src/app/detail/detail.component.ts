import { Component, OnInit } from '@angular/core';
import { MusixService } from '../musix.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {

  public arrayMusix:any=[];
  constructor(private musixService:MusixService, private route:ActivatedRoute, private router:Router) { }

  ngOnInit() {
    this.displayDetails();
  }

  displayDetails():any
  {
    const artist=this.route.snapshot.paramMap.get('artist');
    
    const album=this.route.snapshot.paramMap.get('album');
    console.log("in detail.ts yuhgl;ojcklj"+ artist);

    this.musixService.showDetails(artist,album).subscribe(data=>
      {
        console.log(data);
        this.arrayMusix=data;      
      });
  }

  addToWish(value) {
    console.log("in addtowish" + value.artist.name);
    var myMusic = {
      trackId:  value.listeners,
      trackName: value.name,
      comments:value.artist.name
    }
    this.musixService.addToWishList(myMusic);
  }
}
