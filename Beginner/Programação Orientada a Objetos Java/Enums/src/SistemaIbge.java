// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
    public static void main(String[] args) {
        //imprimindo os estados existentes no enum
        for(EstadoBrasileiro e: EstadoBrasileiro.values() ) {
            System.out.println(e.getSigla() + " - " + e.getNomeMaiusculo());
        }

        //selecionando um estado a partir das opções disponíveis
        EstadoBrasileiro ebSelecionado = EstadoBrasileiro.SAO_PAULO;

        System.out.println(ebSelecionado.getNome());
        System.out.println(ebSelecionado.getSigla());
        System.out.println(ebSelecionado.getNomeMaiusculo());
        System.out.println(ebSelecionado.getIbge());
//        System.out.println("O estado selecionado foi: " + eSelecionado.getNome());
    }
}
