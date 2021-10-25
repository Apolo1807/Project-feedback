package io.github.apolo.repository;

import io.github.apolo.dto.MovieDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieDTO, Long> {
}
