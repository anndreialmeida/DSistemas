public class Mamifero extends Animal {

    private String alimento;

    public Mamifero(String nome, Double comprimento, Integer numDePatas, String cor, String ambiente, Double velocidadeMedia, String alimento) {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    @Override
    public String toString() {
        return super.toString() + "Mamifero{" +
                "alimento='" + alimento + '\'' +
                '}';
    }
}
