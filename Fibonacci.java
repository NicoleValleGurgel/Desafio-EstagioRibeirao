import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> fibonacciSequence(int n) {
        List<Integer> fibSequence = new ArrayList<>();
        fibSequence.add(0);
        fibSequence.add(1);
        while (fibSequence.get(fibSequence.size() - 1) < n) {
            int nextValue = fibSequence.get(fibSequence.size() - 1) + fibSequence.get(fibSequence.size() - 2);
            fibSequence.add(nextValue);
        }
        return fibSequence;
    }

    public static String isInFibonacci(int n) {
        List<Integer> fibSequence = fibonacciSequence(n);
        if (fibSequence.contains(n)) {
            return "O número " + n + " pertence a sequencia de Fibonacci.";
        } else {
            return "O número " + n + " não pertence a sequencia de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        int numero = 22;

        
        String resultado = isInFibonacci(numero);
        System.out.println(resultado);
    }

}