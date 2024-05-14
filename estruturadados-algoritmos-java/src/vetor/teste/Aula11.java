package vetor.teste;

import vetor.Lista;
import vetor.VetorObjetos;

public class Aula11 {

    public static void main(String[] args) {

        /*
        VetorObjetos vetor = new VetorObjetos(2);

        vetor.adiciona(1);
        vetor.adiciona("Elemento tipo String");

        System.out.println(vetor);
         */

         Lista<String> vetor = new Lista<String>(1);

         vetor.adiciona("Elemento");


         
        Lista<Contato> vetor2 = new Lista<>(1);

        Contato c1 = new Contato("Contato 1", "1234-567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2234-567", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3234-567", "contato3@email.com");

        vetor2.adiciona(c1);

    }
}
