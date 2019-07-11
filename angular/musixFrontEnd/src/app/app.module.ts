import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RoutingModule } from './routing.module';
import { HttpClientModule }    from '@angular/common/http';
import {FormsModule}  from '@angular/forms';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { WishlistComponent } from './wishlist/wishlist.component';
import { DetailsComponent } from './details/details.component';
import { SearchResultComponent } from './search-result/search-result.component';
import { MusixService } from './musix.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    WishlistComponent,
    DetailsComponent,
    SearchResultComponent
  ],
  imports: [
    RoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserModule
  ],
  providers: [MusixService],
  bootstrap: [AppComponent]
})
export class AppModule { }
