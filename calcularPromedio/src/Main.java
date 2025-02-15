import java.util.List;

public class Main {

    public static double calcularPromedio(List<Integer> lista) {
        if (lista == null || lista.isEmpty()) {
            return 0;
        }

        int suma = 0;
        for (int numero : lista) {
            suma += numero;
        }

        return (double) suma / lista.size();
    }

    public static void main(String[] args) {
        List<Integer> miLista = List.of(5, 10, 15, 20);

        double promedio = calcularPromedio(miLista);

        System.out.println("El promedio es: " + promedio);
    }
}
