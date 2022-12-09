package P2;

import java.util.Scanner;

public class MainBankAccount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount B = new BankAccount(in.nextInt());
        int count = in.nextInt();
        for (int i = 0; i < count; i++) {
            int a = in.nextInt();
            int money = in.nextInt();

                switch (a) {
                    case 1:
                        B.deposit(money);
                        break;
                    case 2:
                        B.withdraw(money);
                        break;
                }
            System.out.println(B.getBalance());
            }
        }
    }

