package task_classes_3;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount("123124152");

        System.out.println(ba1);

        ba1.setBalance(1000);
        ba1.deposit(520);
        ba1.deposit(120);
        ba1.withdraw(1800);

        System.out.println(ba1);
    }
}
