public class TestarPessoa {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Maria", "49 999999999", "Rua 7 de Setembro", "12345678912");
        PessoaJuridica pj = new PessoaJuridica("Empresa X", "47 999888881", "Rua XV Novembro", "11122233399945");

        System.out.println(pf);
        System.out.println(pj);

    }
}
