package org.example.model;

import org.example.view.NavegadorView;

import java.util.List;

public class Safari implements NavegadorView {
    private String siteAtual;
    private List<String> historico;
    private List<String> favoritos;

    public Safari() {
    }

    public Safari(String siteAtual, List<String> historico, List<String> favoritos) {
        this.siteAtual = siteAtual;
        this.historico = historico;
        this.favoritos = favoritos;
    }

    public String getSiteAtual() {
        return siteAtual;
    }

    public void setSiteAtual(String siteAtual) {
        this.siteAtual = siteAtual;
    }

    public List<String> getHistorico() {
        return historico;
    }

    public void setHistorico(List<String> historico) {
        this.historico = historico;
    }

    public List<String> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<String> favoritos) {
        this.favoritos = favoritos;
    }

    public void addFavoritos(String url){}
    public void verHistorico(){}
    public void acessarSite(String url){}

}
