package one.digitalinnovation.gof.strategy;

public class ComportamentoFactory {

    public static Comportamento criarComportamento(String tipo) {
        switch (tipo) {
            case "agressivo":
                return new ComportamentoAgressivo();
            case "defensivo":
                return new ComportamentoDefensivo();
            case "normal":
                return new ComportamentoNormal();
            default:
                throw new IllegalArgumentException("Tipo de comportamento desconhecido.");
        }
    }
}
