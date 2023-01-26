package org.metodos.pt3;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
//      System.out.println("TV Ligada ? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
//      System.out.println("TV LIGADA ? " + smartTv.ligada);
//      System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.mudarCanal(13);
//      System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.desligar();
//      System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}
