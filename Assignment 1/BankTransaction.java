class Bank {
    private int balance = 1000;

    public synchronized void transfer(Bank to, int amount) {
        if (balance >= amount) {
            balance -= amount;
            to.balance += amount;
            System.out.println(Thread.currentThread().getName() + " transferred " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public int getBalance() {
        return balance;
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        Thread t1 = new Thread(() -> acc1.transfer(acc2, 500), "Thread-1");
        Thread t2 = new Thread(() -> acc2.transfer(acc1, 500), "Thread-2");

        t1.start();
        t2.start();
    }
}

