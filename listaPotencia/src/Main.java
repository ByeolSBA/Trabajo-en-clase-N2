
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Integer> listaPotencia(int exponente, List<Integer> lista) {
        List<Integer> resultado = new ArrayList<>();

        for (int numero : lista) {
            resultado.add((int) Math.pow(numero, exponente));
        }

 ;       return resultado;
    }

    public static void main(String[] args) {
        List<Integer> miLista = List.of(1, 2, 3, 4);
        List<Integer> resultado = listaPotencia(2, miLista);

        System.out.println(resultado);

    }
}
