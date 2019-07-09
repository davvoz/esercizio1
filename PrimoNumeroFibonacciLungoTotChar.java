import java.math.BigDecimal;

public class PrimoNumeroFibonacciLungoTotChar {
    private final int numeroCaratteri = 1000;

    public void main(String[] args) throws Exception {

        System.err.println("Il primo numero della sequenza Fibonacci con " + numeroCaratteri + " caratteri è " + searcIntoFibonacciSequence(numeroCaratteri));
    }

    private BigDecimal fibonacci(int num) {
        BigDecimal a = new BigDecimal(1), b = new BigDecimal(0), temp;
        while (num >= 0) {
            temp = a;
            a = a.add(b);
            b = temp;
            num--;
        }
        return b;
    }

    private String searcIntoFibonacciSequence(int numeroCaratteri) {
        boolean trovato = false;
        Integer counter = 0;
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
