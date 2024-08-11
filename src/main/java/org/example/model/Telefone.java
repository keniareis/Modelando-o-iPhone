package org.example.model;

import org.example.view.PhoneView;

import java.util.List;

public class Telefone implements PhoneView {
    private String numero;
    private List<Contato> cotatos;
    private String fazerChamada;

    public Telefone() {
    }

    public Telefone(String numero, List<Contato> cotatos, String fazerChamada) {
        this.numero = numero;
        this.cotatos = cotatos;
        this.fazerChamada = fazerChamada;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public List<Contato> getCotatos() {
        return cotatos;
    }

    public void setCotatos(List<Contato> cotatos) {
        this.cotatos = cotatos;
    }

    public String getFazerChamada() {
        return fazerChamada;
    }

    public void setFazerChamada(String fazerChamada) {
        this.fazerChamada = fazerChamada;
    }

    public void fazerLigacao(String numero){}
    public void encerrarLigacao(){}
    public void adicionarContato(Contato contato){}
    public void verHistorico(){}
}
