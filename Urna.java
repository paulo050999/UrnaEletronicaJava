import java.util.ArrayList;

public class Urna {
    private ArrayList<Candidato> candidatos;
    private int votosNulos;

    public Urna() {
        candidatos = new ArrayList<>();
        votosNulos = 0;
        inicializarCandidatos();
    }

    private void inicializarCandidatos() {
        candidatos.add(new CandidatoPresidencial("Ada Lovelace", "01"));
        candidatos.add(new CandidatoPresidencial("Alan Turing", "02"));
        candidatos.add(new CandidatoPresidencial("Marie Curie", "03"));
        candidatos.add(new CandidatoPresidencial("Albert Einstein", "04"));
        candidatos.add(new CandidatoPresidencial("Ludwig van Beethoven", "05"));
    }

    public void receberVoto(String numero) {
        boolean votoValido = false;
        for (Candidato candidato : candidatos) {
            if (candidato.getNumero().equals(numero)) {
                candidato.incrementarVotos();
                votoValido = true;
                break;
            }
        }
        if (!votoValido) {
            votosNulos++;
        }
    }

    public void apurarResultados() {
        System.out.println("\nResultado da Votação:");
        int totalVotosValidos = 0;
    for (int i = 0; i < candidatos.size(); i++) {
    totalVotosValidos += candidatos.get(i).getVotos();
}

        for (Candidato candidato : candidatos) {
            int votos = candidato.getVotos();
            double percentual = totalVotosValidos > 0 ? (votos * 100.0 / totalVotosValidos) : 0;
            System.out.printf("%s: %d votos (%.1f%%)%n", candidato.getDescricao(), votos, percentual);
        }

        System.out.println("Votos Nulos: " + votosNulos);
        exibirVencedor();
    }

    private void exibirVencedor() {
        Candidato vencedor = null;
        boolean empate = false;
        for (Candidato candidato : candidatos) {
            if (vencedor == null || candidato.getVotos() > vencedor.getVotos()) {
                vencedor = candidato;
                empate = false;
            } else if (candidato.getVotos() == vencedor.getVotos()) {
                empate = true;
            }
        }

        if (vencedor != null && !empate) {
            System.out.println("Vencedor: " + vencedor.getDescricao());
        } else {
            System.out.println("Houve um empate entre os candidatos com mais votos.");
        }
    }
}