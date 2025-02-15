import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> combinarListas(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> resultado = new ArrayList<>(lista1);
        resultado.addAll(lista2);
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> lista1 = List.of(1, 2, 3);
        List<Integer> lista2 = List.of(4, 5, 6);
        List<Integer> resultado = combinarListas(lista1, lista2);
        System.out.println(resultado);
    }
}
