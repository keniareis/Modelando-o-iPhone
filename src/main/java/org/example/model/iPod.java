package org.example.model;

import org.example.view.PlayerView;

import java.util.List;

public class iPod implements PlayerView {

    private List<Musica> bibliotecaMusical;
    private boolean reproduzindo;
    private int volume;

    public iPod() {
    }

    public iPod(List<Musica> bibliotecaMusical, boolean reproduzindo, int volume) {
        this.bibliotecaMusical = bibliotecaMusical;
        this.reproduzindo = reproduzindo;
        this.volume = volume;
    }

    public List<Musica> getBibliotecaMusical() {
        return bibliotecaMusical;
    }

    public void setBibliotecaMusical(List<Musica> bibliotecaMusical) {
        this.bibliotecaMusical = bibliotecaMusical;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void tocarMusica(){}
    public void pausarMusica(){}
    public void organizarPlaylist(String nome){}
    public void ajustarVolume(int nivel){}
}
