import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SearchResultComponent } from './search-result/search-result.component';
import { WishListComponent } from './wish-list/wish-list.component';
import { DeleteComponent } from './delete/delete.component';
import { HomeComponent } from './home/home.component';
import { DetailComponent } from './detail/detail.component';

const routes: Routes = [
  {path:'result/:name',component:SearchResultComponent},
  {path:'wish',component:WishListComponent},
  {path:'delete/:name',component:DeleteComponent},
  {path:'home',component:HomeComponent},
  {path:'detail/:artist/:album', component:DetailComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
