import java.util.Scanner;

public class PraticaResultadoEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a a primeira nota");
            int nota1 = scanner.nextInt();

        System.out.println("Digite a segunda nota");
            int nota2 = scanner.nextInt();

        System.out.println("Digite a terceira nota");
            int nota3 = scanner.nextInt();

        int media = (nota1 + nota2 + nota3) / 3;
        

        if(media >= 70)

            System.out.println("Parabéns você foi aprovado, sua média anual foi de: " + media);

        else

            System.out.println("Você foi reprovado, sua média anual foi de: " + media);

    }
    
}
