public class CandidatoPresidencial extends Candidato {
    public CandidatoPresidencial(String nome, String numero) {
        super(nome, numero);
    }

    @Override
    public String getDescricao() {
        return "Candidato Presidencial: " + getNome();
    }
}