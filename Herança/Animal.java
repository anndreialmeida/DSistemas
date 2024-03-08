public class Animal {

    private String nome;
    private Double comprimento;
    private Integer numDePatas;
    private String cor;
    private String ambiente;
    private Double velocidadeMedia;


    public Animal(String nome, Double comprimento, Integer numDePatas, String cor, String ambiente, Double velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numDePatas = numDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public Animal() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getComprimento() {
        return comprimento;
    }

    public void setComprimento(Double comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getNumDePatas() {
        return numDePatas;
    }

    public void setNumDePatas(Integer numDePatas) {
        this.numDePatas = numDePatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(Double velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", comprimento=" + comprimento +
                ", numDePatas=" + numDePatas +
                ", cor='" + cor + '\'' +
                ", ambiente='" + ambiente + '\'' +
                ", velocidadeMedia=" + velocidadeMedia +
                '}';
    }
}
