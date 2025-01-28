public class Main {
    public static void main(String[] args) {

        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("Gustavo Cesar Tobe");
        pessoaFisica.setCpf("10176596345");
        pessoaFisica.setEndereco("Rua da União 3696");

        System.out.println(pessoaFisica);

        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setNome("Gustavo System");
        pessoaJuridica.setCnpj("09.905.359/0001-82");
        pessoaJuridica.setEndereco("Avenida Brasil 4569");

        System.out.println(pessoaJuridica);


    }
}
