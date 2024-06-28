package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class BankServce {
    public static void main(String[] args) {
//
////         <실습1>
////        BankAccount b1 = new BankAccount("1234");
////        b1.deposit(5000);
////
////        BankAccount b2 = new BankAccount("4321");
////        b2.deposit(5000);
////        b2.transfer(5000, b1);
////        System.out.println(b2.getBalance()); // 0원
////        System.out.println(b1.getBalance()); // 10000원
//
////        <실습2>
//        List<BankAccount> bankAccounts = new ArrayList<>();
//        while (true) {
//            System.out.println("어떤 서비스를 이용하시겠어요?");
//            System.out.println("1.계좌개설, 2. 입금, 3. 출금, 4. 계좌송금");
//            Scanner sc = new Scanner(System.in);
//            int input = Integer.parseInt(sc.nextLine());
//
//            if (input == 1) {
//                System.out.println("계좌번호를입력하세요.\n");
//                String accountNumber = sc.nextLine();
//                BankAccount bankAccount = new BankAccount(accountNumber);
//                bankAccounts.add(bankAccount);
//
//            } else if (input == 2) {
//                System.out.println("계좌번호를 입력해주세요.");
//                String accountNumber = sc.nextLine();
//                System.out.println("얼마 입금하시겠어요?\n");
//                int money = Integer.parseInt(sc.nextLine());
//                for (int i=0; i<bankAccounts.size(); i++){
//                    if (bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
//                        bankAccounts.get(i).deposit(money);
//                    }
//                }
//
//            } else if (input == 3) {
//                System.out.println("계좌번호를 입력해주세요.");
//                String accountNumber = sc.nextLine();
//                System.out.println("얼마 출금하시겠어요?\n");
//                int money = Integer.parseInt(sc.nextLine());
//                for (int i=0; i<bankAccounts.size(); i++){
//                    if (bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
//                        bankAccounts.get(i).withdrow(money);
//                    }
//                }
//
//
//            } else if( input == 4){
//                System.out.println("본인 계좌번호를 입력하세요");
//                String myNumber = sc.nextLine();
//                System.out.println("상대방 계좌번호를 입력하세요");
//                String yourNumber = sc.nextLine();
//                System.out.println("얼마 입금하겠습니까?");
//                int money = Integer.parseInt(sc.nextLine());
//                BankAccount myAccount = null;
//                BankAccount yourAccount = null;
//                for(int i=0; i<bankAccounts.size(); i++){
//                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
//                        myAccount = bankAccounts.get(i);
//                    }
//                    if(bankAccounts.get(i).getAccountNumber().equals(yourNumber)){
//                        yourAccount = bankAccounts.get(i);
//                    }
//                }
//
//
//
//            }
//
//
//        }
//
//
//
//
//
//
//
//
    }
}
//
//class BankAccount{
//
//    private String accountNumber; //계좌번호 생성
//
//    private int balance; //잔액 생성
//
//    BankAccount(String accountNumber){          //생성자
//        this.accountNumber = accountNumber;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//
//    public void deposit(int money, BankAccount bankAccount){     //입금 메소드
//        int myMoney = bankAccount.getBalance();
//        int total = myMoney + money;
//        System.out.println(money + "원 입금 되었습니다.");
//        System.out.println("현재 잔액은 "+ this.balance + "원 입니다.");
//    }
//    public void withdrow(int money){    //출금 메소드
//        if (this.balance< money){
//            System.out.println("잔액 부족입니다.");
//            System.out.println("현재 잔액은 "+ this.balance + "원 입니다.");
//        }else {
//            this.balance -= money;
//            System.out.println(money + "원 출금되었습니다.");
//            System.out.println("현재 잔액은 "+ this.balance + "원 입니다.");
//        }
//
//    }
//
//
//
//}





