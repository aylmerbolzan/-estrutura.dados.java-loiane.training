package vetor.teste;

import java.util.ArrayList;

public class Aula12 {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("A");
        arrayList.add("C");

        System.out.println(arrayList);

        // Adiciona
        arrayList.add(1, "B");

        System.out.println(arrayList);

        // Busca
        boolean existe = arrayList.contains("A");
        if (existe){
            System.out.println("Elemento existe no array");
        } else {
            System.out.println("Elemento não existe no array");
        }

        // Busca
        int pos = arrayList.indexOf("B");
        if (pos > -1) {
            System.out.println("Elemento existe no array na posição " + pos);
        } else {
            System.out.println("Elemento não existe no array");
        }

        // Busca por posição
        System.out.println(arrayList.get(2));

        // Remover
        arrayList.remove(0);
        arrayList.remove("B");

        System.out.println(arrayList);

        // Tamanho
        System.out.println(arrayList.size());

    }
}
