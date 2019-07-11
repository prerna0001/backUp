import { Component, OnInit } from '@angular/core';
import { MusixService } from '../musix.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.css']
})
export class SearchResultComponent implements OnInit {

  constructor(private musixService:MusixService,private route:ActivatedRoute,private router:Router) { }

  arrayMusix:any=[];

  ngOnInit() {
    this.getSearchedMusic();
  }

  getSearchedMusic():any
  {
    const getMusic=this.route.snapshot.paramMap.get('name');
    this.musixService.getMusic(getMusic).subscribe(data=>{
        console.log("getSearchedMusic works");
        this.arrayMusix=data.results.trackmatches.track;
    });
    
  }

  
}
