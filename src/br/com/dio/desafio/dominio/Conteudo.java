package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    protected static final int XP_PADRAO = 10;
    private String titulo;
    private String descricao;
    private int cargaHoraria;

    protected abstract int calcularXP();

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

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
