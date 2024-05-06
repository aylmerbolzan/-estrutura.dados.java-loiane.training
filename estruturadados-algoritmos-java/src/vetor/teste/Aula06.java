package vetor.teste;

import vetor.Vetor;

public class Aula06 {
    public static void main(String[] args) {
                Vetor vetor = new Vetor(10);
        vetor.adiciona("Elemento 01");
        vetor.adiciona("Elemento 02");
        vetor.adiciona("Elemento 03");

        System.out.println(vetor.busca("Elemento 1"));
        System.out.println(vetor.busca("Elemento 01"));
        System.out.println(vetor.busca(1));
    }
}
