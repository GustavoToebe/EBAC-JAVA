public class Main {
    public static void main(String[] args) {
        Double nota1 = 10.0;
        Double nota2 = 4.5;
        Double nota3 = 7.5;
        Double nota4 = 6.5;

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7){
            System.out.println("Aprovado");
        }else if (media >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
