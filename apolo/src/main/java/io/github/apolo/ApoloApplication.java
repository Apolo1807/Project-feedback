package io.github.apolo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.github.apolo.dto.MovieDTO;
import io.github.apolo.filmeEnum.CategoriaFilme;
import io.github.apolo.filmeEnum.TipoFilme;
import io.github.apolo.repository.MovieRepository;

@SpringBootApplication
public class ApoloApplication {
	
	@Bean
	public CommandLineRunner run(@Autowired MovieRepository repository) {
		return args -> {
			MovieDTO dto = new MovieDTO();
			
	        dto.setId(1L);
	        dto.setDescricao("muito bom");
	        dto.setCategoria(CategoriaFilme.ACAO);
	        dto.setNomeFilme("MATRIX");
	        dto.setDataFim(LocalDate.of(2021, 12, 31));
	        dto.setTipoFilme(TipoFilme.FILME);
	        dto.setNota(9L);
	        
	        repository.save(dto);		
	      };
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApoloApplication.class, args);
	}
}
