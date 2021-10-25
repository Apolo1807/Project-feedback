package io.github.apolo.filmeEnum;

import lombok.Getter;

@Getter
public enum TipoFilme {

    FILME(1), SERIE(2), ANIME(3);

    public Integer tipos;

    TipoFilme(int valor) {
        tipos = valor;
    }
}
