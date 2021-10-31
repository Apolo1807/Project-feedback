import { ProfileAboutComponent } from './profile-about/profile-about.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MovieFormComponent } from './movie-form/movie-form.component';
import { HomeComponent } from './home/home.component';
import { MovieListComponent } from './movie-list/movie-list.component';

const routes: Routes = [
  {path:'home', component: HomeComponent},
  {path: 'list', component: MovieListComponent},
  {path: 'list/:id', component: MovieFormComponent},
  {path: 'new', component: MovieFormComponent},
  {path: 'profile', component: ProfileAboutComponent},
  {path: '', component: HomeComponent},
  {path: '**', component: HomeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
