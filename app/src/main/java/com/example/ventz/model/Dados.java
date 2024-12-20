package com.example.ventz.model;

public class Dados {
    private static Dados instance;
    private String url;
    private int idUsuarioLogado;
    private int idDeckAtual;
    private String nomeDeckAtual;

    private Dados() { }

    // Ele instancia Dados se necessário
    public static synchronized Dados getInstance() {
        if (instance == null) {
            instance = new Dados();
        }
        return instance;
    }

    public static void setInstance(Dados instance) {
        Dados.instance = instance;
    }

    public String getNomeDeckAtual() {
        return nomeDeckAtual;
    }

    public void setNomeDeckAtual(String nomeDeckAtual) {
        this.nomeDeckAtual = nomeDeckAtual;
    }

    public int getIdDeckAtual() {
        return idDeckAtual;
    }

    public void setIdDeckAtual(int idDeckAtual) {
        this.idDeckAtual = idDeckAtual;
    }

    public int getIdUsuarioLogado() {
        return idUsuarioLogado;
    }

    public void setIdUsuarioLogado(int idUsuarioLogado) {
        this.idUsuarioLogado = idUsuarioLogado;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}