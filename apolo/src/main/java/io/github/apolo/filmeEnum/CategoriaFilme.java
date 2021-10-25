package io.github.apolo.filmeEnum;

import lombok.Getter;

@Getter
public enum CategoriaFilme {

    ACAO(1), AVENTURA(2), COMEDIA(3), DANCA(4), DOCUMENTARIO(5),
    DRAMA(6), FANTASIA(7), FICCAO(8), MUSICAL(9), ROMANCE(10),
    TERROR(11), SUSPENSE(12);

    private Integer categoria;

    CategoriaFilme(int valor) {
        this.categoria = valor;
    }

}
