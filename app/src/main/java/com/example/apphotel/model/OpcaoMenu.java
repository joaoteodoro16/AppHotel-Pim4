package com.example.apphotel.model;

public class OpcaoMenu {
    private String titulo;
    private int imagem;

    public OpcaoMenu() {
    }

    public OpcaoMenu(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
