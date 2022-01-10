package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Curso {
    private String titulo;
    private String descricao;
    private float cargaHoraria;

    public void calcularXp(){
        
    }

    public Curso(String titulo, String descricao, float cargaHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
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

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Float.compare(curso.cargaHoraria, cargaHoraria) == 0 && titulo.equals(curso.titulo) && descricao.equals(curso.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, descricao, cargaHoraria);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
