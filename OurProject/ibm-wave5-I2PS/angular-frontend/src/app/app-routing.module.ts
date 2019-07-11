import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RecentIdeasComponent } from './recent-ideas/recent-ideas.component';
import { ModalSuccessComponent } from './modal-success/modal-success.component';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { ServiceProviderRegistrationComponent } from './service-provider-registration/service-provider-registration.component';
import { InnovatorRegistrationComponent } from './innovator-registration/innovator-registration.component';
import { UserLoginComponent } from './user-login/user-login.component';
import { ServiceProviderDashboardComponent } from './service-provider-dashboard/service-provider-dashboard.component';
import { ServiceProviderProfileComponent } from './service-provider-profile/service-provider-profile.component';
import { InnovatorProfileComponent } from './innovator-profile/innovator-profile.component';
import { InnovatorDashboardComponent } from './innovator-dashboard/innovator-dashboard.component';
import { PostIdeaComponent } from './post-idea/post-idea.component';
import { NavbarComponent } from './navbar/navbar.component';
import { FooterComponent } from './footer/footer.component';
import { IntelligentServiceComponent } from './intelligent-service/intelligent-service.component';




const routes: Routes = [
  {path:'recentideas', component:RecentIdeasComponent},
  {path:'modalsuccess', component:ModalSuccessComponent},
  {path:'about',component:AboutComponent},
  {path:'home',component:HomeComponent},
  {path:'serviceproviderregistration',component:ServiceProviderRegistrationComponent},
  {path:'innovatorregistration',component:InnovatorRegistrationComponent},
  {path:'login',component:UserLoginComponent},
  {path:'serviceDashboard',component:ServiceProviderDashboardComponent},
  {path:'serviceProfile',component:ServiceProviderProfileComponent},
  {path:'innovatorDashboard',component:InnovatorDashboardComponent},
  {path:'innovatorProfile',component:InnovatorProfileComponent},
  {path:'postIdea',component:PostIdeaComponent},
{path:'nav',component:NavbarComponent},
{path:'footer',component:FooterComponent},
{path:'intelligent',component:IntelligentServiceComponent}




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
