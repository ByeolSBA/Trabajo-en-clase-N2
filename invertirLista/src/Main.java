import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> invertirLista(List<Integer> lista) {
        List<Integer> resultado = new ArrayList<>();
        for (int i = lista.size() - 1; i >= 0; i--) {
            resultado.add(lista.get(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> miLista = List.of(1, 2, 3, 4);
        List<Integer> resultado = invertirLista(miLista);
        System.out.println(resultado);
    }
}
