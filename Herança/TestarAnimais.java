public class TestarAnimais {

    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 120.0, 4, "Amarela", "Terra", 2.0, "Leite");

        Peixe tubarao = new Peixe("Tilapia", 20.0, 0, "Cinzento", "Mar", 1.5, "Cauda" );

        Mamifero ursocanada = new Mamifero("Urso-do-canadá", 180.0, 4, "Vermelho", "Terra", 0.5, "Mel" );

        System.out.println(camelo);
        System.out.println(tubarao);
        System.out.println(ursocanada);
    }
}