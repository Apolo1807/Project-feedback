import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { SidebarModule } from 'ng-sidebar';
import { HttpClientModule } from '@angular/common/http'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieListComponent } from './movie-list/movie-list.component';
import { HomeComponent } from './home/home.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MovieFormComponent } from './movie-form/movie-form.component';
import { ProfileAboutComponent } from './profile-about/profile-about.component';
import { MoviesService } from './movies.service'

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    HomeComponent,
    MovieFormComponent,
    ProfileAboutComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    SidebarModule.forRoot(),
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [
    MoviesService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
