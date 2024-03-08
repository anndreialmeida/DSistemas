public class Peixe extends Animal {

    private String caracteristica;

    public Peixe(String nome, Double comprimento, Integer numDePatas, String cor, String ambiente, Double velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numDePatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public Peixe(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Peixe{" +
                "caracteristica= " + caracteristica + '\'' +
                '}';
    }
}
