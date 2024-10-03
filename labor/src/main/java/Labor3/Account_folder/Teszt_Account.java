package Labor3.Account_folder;

public class Teszt_Account {
    public static void main(String[] args) {
        System.out.println(Account.getRate());
        Account sz1 = new Account();
        Account sz2 = new Account(1, 2000);

        System.out.println(sz1);
        System.out.println(sz2);

        sz2.deposit(300);

        System.out.println(sz2);
    }
}
