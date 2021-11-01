package io.github.apolo.dto;

import io.github.apolo.filmeEnum.CategoriaFilme;
import io.github.apolo.filmeEnum.TipoFilme;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_filme")
    @NotEmpty
    private String nomeFilme;

    @Column(length = 1000)
    private String descricao;

    @Column(name = "tipo_filme")
    private TipoFilme tipoFilme;

    @Column(name = "categoria_filme")
    private CategoriaFilme categoria;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column
    @NotNull
    private Long nota;

}
