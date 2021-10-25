package io.github.apolo.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import io.github.apolo.dto.MovieDTO;
import io.github.apolo.repository.MovieRepository;
import utils.Fixtures;

public class ControllerTest {

	MovieRepository repository = mock(MovieRepository.class);
	MovieController controller = mock(MovieController.class);
	
	@Test
	public void findByIdTest() {
		
		MovieDTO dto = Fixtures.createMovieDTO();
		when(controller.findById(dto.getId())).thenReturn(dto);
		
		MovieDTO found = controller.findById(dto.getId());
		
		verify(controller, times(1)).findById(dto.getId());
		
		assertEquals(dto, found);
	}
	
	@Test
	public void salvarFilmeTest() {
		
		MovieDTO dto = Fixtures.createMovieDTO();
		
		when(controller.salvarFilme(dto)).thenReturn(dto);
		controller.salvarFilme(dto);
		
		verify(controller, times(1)).salvarFilme(dto);
	}
	
	@Test
	public void deletarFilme() {
		
		MovieDTO dto = Fixtures.createMovieDTO();
		controller.deletar(dto);
		
		verify(controller, times(1)).deletar(dto);
	}
}
