import java.util.*;

public class Parte1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> listanomes = new ArrayList<String>();

        String nomes = sc.nextLine();

        String[] stringSuporte = nomes.split(",");

        for(String nome : stringSuporte){
            listanomes.add(nome);
        }

        Collections.sort(listanomes);

        for(String nome : listanomes){
            System.out.println(nome);
        }


    }
}
