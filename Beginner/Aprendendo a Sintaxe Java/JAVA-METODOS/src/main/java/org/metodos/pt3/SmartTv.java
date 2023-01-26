package org.metodos.pt3;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando o Canal para o : " + canal);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando o Canal para o : " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando o Canal para o : " + canal);
    }

    public void aumentarVolume() {
//      volume = volume +1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
//      volume = volume -1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar() {
        ligada = true;
        System.out.println("TV está ligada ? " + ligada);
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV está ligada ? " + ligada);
    }

}
