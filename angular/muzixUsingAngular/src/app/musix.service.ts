//apikey 404e604cdac0f92a6ee9f37667f21c2e

import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class MusixService {

  constructor(private http:HttpClient) { }

  getTrendMusic():any{
    return this.http.get("http://ws.audioscrobbler.com/2.0/?method=chart.gettoptracks&api_key=404e604cdac0f92a6ee9f37667f21c2e&format=json");
  }

  getMusic(value):any{
    var url=`http://ws.audioscrobbler.com/2.0/?method=track.search&api_key=404e604cdac0f92a6ee9f37667f21c2e&track=${value}&format=json`;
    return this.http.get(url);
  }

  addToWishList(value) : any {
    this.http.post("http://localhost:8102/api/v1/music",value).subscribe();
    console.log(value);
   }

   displayWishList():any
   {
     return this.http.get("http://localhost:8102/api/v1/music");
   }

   public deleteFromWishList(value):any
   {
     this.http.delete(`http://localhost:8102/api/v1/music/${value}`).subscribe();

   }

   showDetails(artistName,trackName):any
   {
     return this.http.get(`http://ws.audioscrobbler.com/2.0/?method=track.getInfo&api_key=404e604cdac0f92a6ee9f37667f21c2e&artist=${artistName}&track=${trackName}&format=json`);
   }
}
