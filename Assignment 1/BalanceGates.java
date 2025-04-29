import java.util.Random;

public class BalanceGates {
    public static void main(String[] args) {
        String[] gates = {"Gate A", "Gate B", "Gate C"};
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Request " + i + " assigned to " + gates[random.nextInt(gates.length)]);
        }
    }
}

