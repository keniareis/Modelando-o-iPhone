package org.example.model;

import org.example.view.iPhoneView;

public class iPhone implements iPhoneView {
    private String modelo;
    private int armazenamento;
    private String cor;
    private String software;

    public iPhone() {
    }

    public iPhone(String modelo, int armazenamento, String cor, String software) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
        this.cor = cor;
        this.software = software;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public void ligar(){
    }

    public void desligar(){
    }

    public void desbloquear(){
    }

    public void abrirApps(){}
}

