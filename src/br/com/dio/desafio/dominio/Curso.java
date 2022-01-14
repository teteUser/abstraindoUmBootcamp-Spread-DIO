package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso extends Conteudo{

    @Override
    protected double calcularXP() {
        return XP_PADRAO * (this.getCargaHoraria());
    }

    @Override
    public String toString() {
        return "[Curso](" +
                "Título = " + this.getTitulo() +
                ", Descrição = " + this.getDescricao() +
                ", Carga horária = " + this.getCargaHoraria() +
                ")\n";
    }
}
