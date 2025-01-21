import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String aux = sc.nextLine();

        String[] listaSup = aux.split(",");

        List<String> listaMasculino = new ArrayList<>();
        List<String> listaFeminino = new ArrayList<>();

        for(String nomeEsexo : listaSup){
            if (nomeEsexo.contains("Masculino") || nomeEsexo.contains("M")){
                listaMasculino.add(nomeEsexo.trim());
            }else if(nomeEsexo.contains("Feminino") || nomeEsexo.contains("F")){
                listaFeminino.add(nomeEsexo.trim());
            }
        }

        Collections.sort(listaMasculino);
        System.out.println("LIsta Masculina");
        for (String nome : listaMasculino){
            System.out.println(nome);
        }

        Collections.sort(listaFeminino);
        System.out.println("LIsta Feminina");
        for (String nome : listaFeminino){
            System.out.println(nome);
        }
    }
}
