import { Component, OnInit } from '@angular/core';
// import{ HttpClient } from '@angular/common/http';

import { MusixService } from '../musix.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  public arrayList:any=[];

  constructor(private musixService:MusixService) { }

  ngOnInit() {
    this.musixService.getTrendMusic()
        .subscribe(data=>
          {
            console.log(data.tracks.track);
            this.arrayList=data.tracks.track;
          });
   
  }
  click(value){
   
    // this.route.navigateByUrl("/result/"+value);
    console.log("This Works");
    this.musixService.getMusic(value).subscribe(data=>
      {
        console.log("Searching");
        this.arrayList=data.results.trackmatches.track;
      })
  }

}
