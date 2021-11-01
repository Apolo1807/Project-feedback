import { ActivatedRoute, Router } from '@angular/router';
import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../movies.service';
import { MovieDTO } from './MovieDTO';

@Component({
  selector: 'app-movie-form',
  templateUrl: './movie-form.component.html',
  styleUrls: ['./movie-form.component.css']
})
export class MovieFormComponent implements OnInit {

  movie: MovieDTO;
  success: boolean = false;
  id: number;

  constructor(
    private service: MoviesService,
    private activated: ActivatedRoute) 

    {this.movie = new MovieDTO();}

  ngOnInit(): void {
    this.activated.params.subscribe(params => {
      this.id = params['id'];
      this.service.editMovie(this.id).subscribe(response => {
        this.movie = response;
      })
    })
  }

  onSubmit() {
    this.service.salvar(this.movie).subscribe( response => {
      this.success = true;
    });
  }
}

