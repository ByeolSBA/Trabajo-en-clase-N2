import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> listasMultiplicacion(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>();

        int size = Math.min(lista1.size(), lista2.size());


        for (int i = 0; i < size; i++) {
            resultado.add(lista1.get(i) * lista2.get(i));
        }

        return resultado;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        List<Integer> lista1 = List.of(1, 2, 3, 4);
        List<Integer> lista2 = List.of(5, 6, 7, 8);

        List<Integer> resultado = listasMultiplicacion(lista1, lista2);

        System.out.println(resultado);
    }
}
