import java.math.BigDecimal;

public class PrimoNumeroFibonacciLungoTotChar {
    private static final int numeroCaratteri = 1000;
    public static void main(String[] args) throws Exception {

        System.out.println("Il primo numero della sequenza Fibonacci con " + numeroCaratteri + " caratteri è " + searchIntoFibonacciSequence(numeroCaratteri));
    }

    private static BigDecimal fibonacci(int num) {
        BigDecimal a = new BigDecimal(1), b = new BigDecimal(0), temp;
        while (num >= 0) {
            temp = a;
            a = a.add(b);
            b = temp;
            num--;
        }
        return b;
    }

    private static String searchIntoFibonacciSequence(int numeroCaratteri) {
        boolean trovato = false;
        int counter = 0;
        String output = null;
        while (!trovato) {
            BigDecimal fibo = fibonacci(counter);
            int numberOfCharters = fibonacci(counter).toString().length();
            if (numberOfCharters == numeroCaratteri) {
                trovato = true;
                output = fibo.toPlainString();
            }
            counter++;
        }
        return output;
    }

}
