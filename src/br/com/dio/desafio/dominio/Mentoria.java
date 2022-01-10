package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate date;

    public void calcularXp(){

    }

    public Mentoria(String titulo, String descricao, LocalDate date) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.date = date;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoria mentoria = (Mentoria) o;
        return titulo.equals(mentoria.titulo) && descricao.equals(mentoria.descricao) && date.equals(mentoria.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, date);
    }
}
