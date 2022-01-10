package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo{
    private float cargaHoraria;

    @Override
    protected double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso {" +
                "Título=" + this.getTitulo() +
                "Descrição=" + this.getDescricao() +
                "Carga horária=" + this.getCargaHoraria() +
                '}';
    }
}
