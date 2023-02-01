import java.util.Scanner;

public class PraticaResultadoEscolar {
    static final int TRIMESTRE = 3;
    static final int MINIMO_NOTA = 70;
    static final int NOTA_RECUPERACAO = 50;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiraNota, segundaNota, terceiraNota;

        System.out.println("Digite a a primeira nota");
            primeiraNota = scanner.nextInt();
        System.out.println("Digite a segunda nota");
            segundaNota = scanner.nextInt();
        System.out.println("Digite a terceira nota");
            terceiraNota = scanner.nextInt();
        scanner.close(); 

        int somaMedia = (primeiraNota + segundaNota + terceiraNota) / TRIMESTRE;
        if(somaMedia >= MINIMO_NOTA)
            System.out.println("Parabéns você foi aprovado, sua média anual foi de: " + somaMedia);
        else if (somaMedia >= NOTA_RECUPERACAO && somaMedia< MINIMO_NOTA)
            System.out.println("Você não conseguiu atingir a média anual, terá que ficar em recuperação, sua média é de: " + somaMedia);
        else
            System.out.println("Você foi reprovado, sua média anual foi de: " + somaMedia);
    }
}
