import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        Manager accs = new Manager();
        ATM_account a1 = new ATM_account(1, 100, 50);
        ATM_account a2 = new ATM_account(2, 200, 50);
        ATM_account a3 = new ATM_account(3, 300, 50);
        ATM_account a4 = new ATM_account(4, 400, 50);
        ATM_account a5 = new ATM_account(5, 500, 50);
        ATM_account a6 = new ATM_account(6, 600, 50);
        ATM_account a7 = new ATM_account(7, 700, 50);
        ATM_account a8 = new ATM_account(8, 800, 80);
        ATM_account a9 = new ATM_account(9, 900, 50);
        ATM_account a10 = new ATM_account(10, 1000, 50);
        accs.add(a1);
        accs.add(a2);
        accs.add(a3);
        accs.add(a4);
        accs.add(a5);
        accs.add(a6);
        accs.add(a7);
        accs.add(a8);
        accs.add(a9);
        accs.add(a10);
        ATM_account human = null;
        Scanner in = new Scanner(System.in);
        while (i == 0) {
            boolean check = true;
            while (check) {
                System.out.print("Enter an id: ");
                int accid = in.nextInt();
                if (accs.have(accid)) {
                    human = accs.seachr(accid);
                    check = false;
                } else System.out.println("Nhập lại");
            }
            while (true) {
                System.out.println("Main menu");
                System.out.println("1: check balance");
                System.out.println("2: withdraw");
                System.out.println("3: deposit");
                System.out.println("4: exit");
                System.out.print("Enter a choice: ");
                int choie = in.nextInt();
                switch (choie) {
                    case 1:
                        System.out.println("Balance: " + human.getBalance());
                        break;
                    case 2:
                        System.out.print("nhập tiền cần rút");
                        human.withdraw(in.nextDouble());
                        System.out.println("Balance: " + human.getBalance());
                        break;
                    case 3:
                        System.out.print("nhập tiền cần nạp");
                        human.deposit(in.nextDouble());
                        System.out.println("Balance: " + human.getBalance());
                        break;
                    case 4:
                        i = 1;
                        break;

                }
            }
        }
    }
}
