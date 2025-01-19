public abstract class Candidato {
    private String nome;
    private String numero;
    private int votos;

    public Candidato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
        this.votos = 0;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public int getVotos() {
        return votos;
    }

    public void incrementarVotos() {
        votos++;
    }

    // Método abstrato que pode ser implementado pelas subclasses
    public abstract String getDescricao();
}