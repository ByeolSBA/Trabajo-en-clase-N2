import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        Set<Integer> set = new HashSet<>(lista);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        List<Integer> miLista = List.of(1, 2, 2, 3, 4, 4, 5);
        List<Integer> resultado = eliminarDuplicados(miLista);
        System.out.println(resultado);
    }
}
