package io.github.apolo.controller;

import io.github.apolo.dto.MovieDTO;
import io.github.apolo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    MovieRepository repository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.repository = movieRepository;
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public MovieDTO salvarFilme(@RequestBody @Valid MovieDTO filme) {
        return repository.save(filme);
    }

    @GetMapping("{id}")
    public MovieDTO findById(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(
                        () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Filme não encontrado"
                ));
    }

    @DeleteMapping("{id}")
    public void deletar(MovieDTO filme) {
        repository.deleteById(filme.getId());
    }

    @PutMapping("/edit/{id}")
    public void editarFilme(@PathVariable Long id, @RequestBody @Valid MovieDTO dto) {
        repository.findById(id).map( movie -> {
            dto.setId(movie.getId());
            return repository.save(dto);
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Filme não encontrado"));
    }

}
