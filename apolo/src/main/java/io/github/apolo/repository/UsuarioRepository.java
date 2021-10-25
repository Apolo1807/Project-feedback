package io.github.apolo.repository;

import io.github.apolo.dto.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <UsuarioDTO, Long> {
}
