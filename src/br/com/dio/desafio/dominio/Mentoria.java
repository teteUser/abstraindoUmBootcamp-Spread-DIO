package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria extends Conteudo{
    private LocalDate date;

    @Override
    protected int calcularXP() {
        return XP_PADRAO + 20;
    }

    public Mentoria(String titulo, String descricao) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.date = LocalDate.now();
        this.setCargaHoraria(2);
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "[Mentoria](" +
                "Título = " + this.getTitulo() +
                ", Descrição = " + this.getDescricao() +
                ", Data e hora = " + this.getDate() +
                ")\n";
    }
}
