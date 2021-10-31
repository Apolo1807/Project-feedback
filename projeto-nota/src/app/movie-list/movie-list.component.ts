import { MovieDTO } from './../movie-form/MovieDTO';
import { Component, OnInit } from '@angular/core';
import { MoviesService } from '../movies.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-movie-list',
  templateUrl: './movie-list.component.html',
  styleUrls: ['./movie-list.component.css']
})
export class MovieListComponent implements OnInit {

  movie: MovieDTO;
  movies: MovieDTO[] = [];

  constructor(
    private service: MoviesService,
    )

    { this.movie = new MovieDTO();}

  ngOnInit(): void {
    this.service.getMovies().subscribe( response => this.movies = response );
  }
}
