import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { MovieDTO } from './movie-form/MovieDTO';

@Injectable({
  providedIn: 'root'
})
export class MoviesService {

  constructor(
    private httpClient: HttpClient   
  ) { }

  salvar(movie: MovieDTO):Observable<MovieDTO> {
    return this.httpClient.post<MovieDTO>('http://localhost:8080/api/movies/new', movie);
  } 

  getMovies():Observable<MovieDTO[]> {
    return this.httpClient.get<MovieDTO[]>('http://localhost:8080/api/movies'); 
  }

  editMovie(id: number):Observable<MovieDTO> {
    return this.httpClient.get<any>(`http://localhost:8080/api/movies/${id}`);
  }

}
