package utils;

import io.github.apolo.dto.MovieDTO;
import io.github.apolo.dto.UsuarioDTO;
import io.github.apolo.filmeEnum.CategoriaFilme;
import io.github.apolo.filmeEnum.TipoFilme;

import java.time.LocalDate;
import java.util.UUID;

public class Fixtures {

    public static MovieDTO createMovieDTO() {

        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setId(1L);
        movieDTO.setDescricao("muito bom");
        movieDTO.setCategoria(CategoriaFilme.ACAO);
        movieDTO.setNomeFilme("MATRIX");
        movieDTO.setDataFim(LocalDate.of(2021, 12, 31));
        movieDTO.setFilme(TipoFilme.FILME);
        movieDTO.setNota(9L);

        return movieDTO;
    }
    
    public static UsuarioDTO createUsuarioDTO() {
    	
    	UsuarioDTO usuarioDTO = new UsuarioDTO();
    	usuarioDTO.setId(UUID.fromString("d944738a-3426-11ec-8d3d-0242ac130003"));
    	usuarioDTO.setEmail("teste@gmail.com");
    	usuarioDTO.setPassword(123456);
    	
    	return usuarioDTO;
    }

}
