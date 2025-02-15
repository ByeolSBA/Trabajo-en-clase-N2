import java.util.List;

public class Main {

    public static boolean estaOrdenada(List<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < lista.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> miLista = List.of(1, 2, 3, 4, 5);
        boolean resultado = estaOrdenada(miLista);
        System.out.println(resultado);
    }
}
