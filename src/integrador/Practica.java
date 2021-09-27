package integrador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practica {

    /**
     * El programa debera tomar un numero x y determinar si es capicua o no
     * **Contemplar que el num que llega puede ser null,en caso de que sea null,
     * retornar false, en caso que sea capicua retornar true.
     *
     * @param num
     * @return esPalindromo
     */
    public Boolean numeroCapicua(Integer num) {
        String aCadena = String.valueOf(num);
        String numCadena = aCadena.replaceAll("\\W", "");
        for (int i = 0; i < numCadena.length() / 2; i++) {
            if (numCadena.charAt(i) != numCadena.charAt(numCadena.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Estamos en caramelolandia, donde estan los peores ladrones de dulces. Una
     * vez al mes, se sienta una n cantidad de ladrones en ronda, contemplando
     * al primer ladron que se sienta, como el ladron 0. A los ladrones se le
     * repartira una m cantidad de caramelos contemplando que se comenzaran a
     * repartir los caramelos desde el primer ladron (inicio). El ultimo
     * caramelo en repartirse estara podrido, determinar a que ladron, segun su
     * posicion en la ronda le tocara.
     *
     * @param inicio
     * @param cantidadCaramelos
     * @param cantidadLadrones
     * @return ladronQueLeTocoElCarameloPodrido
     */
    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {

       /* int caramelosRestantes = cantidadCaramelos;
        int reset = cantidadLadrones;
        int contador = inicio;
        while (caramelosRestantes != 0) {
            if (contador == reset) {
                contador = 0;
            }
            contador++;
            caramelosRestantes--;
        }

        return contador - 1; 

    }*/
       int ladron = inicio;
        while (cantidadCaramelos != 0) {
            if (inicio == cantidadLadrones) {
                ladron = 0;
                
            } else {
                ladron ++;
                cantidadCaramelos --;
            }
            }
        return ladron - 1;
        }

    /**
     * En un universo paralelo, donde los habitantes son medias, existe un
     * crucero de medias donde se sube una lista de medias. Esta lista de
     * tripulantes del crucero es una Collection de letras, lo que se debera
     * hacer, es filtrar la lista de medias que se suben al crucero y retornar
     * una lista que contenga los grupos de medias que si tenian amigas. Esta
     * lista final de medias amigas se mostraran ordenadas de menor a mayor. A
     * continuacion un ejemplo:
     *
     * List de medias que llegan : A,B,A,B,C,A,F,Z,C,H **F,Z,H no tienen amigas
     * :(. List que se deberia retornar : A,B,C
     *
     *
     * @param pasajeros
     * @return mediasAmigas
     */
    public List<String> mediasAmigas(List<String> pasajeros) {

        List<String> solucion = new ArrayList();
        Set<String> repetidos = new HashSet();

        String[] lista = pasajeros.toArray(new String[pasajeros.size()]);

        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length - 1; j++) {
                if (lista[i] == lista[j]) {
                    repetidos.add(lista[i]);
                }
            }
        }
        solucion.addAll(repetidos);
        return solucion;
    }
}
