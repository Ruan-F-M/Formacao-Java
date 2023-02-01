package CondiçãoTernária;

public class ResultadoEscolar {
	public static void main(String[] args) {
/*  Cenário 1
		int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado);  */

        // Cenário 2
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
