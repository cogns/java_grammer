package C02ClassBasic;

import java.util.Scanner;

public class C0206RecursiveBasic {
    public static void main(String[] args) {
////        for문ㅇ로 1~10까지 누적합계
//        int total = 0;
//        for (int i=0; i<=10; i++){
//            total += i;
//        }
//        System.out.println(total);
//        System.out.println(addAcc(10));

//        피보나치 수열 100번째
//        1 1 2 3 5 8 13 21 ...
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int a = 1;
//        int b = 1;
//        for (int i=2; i<n; i++){
//            int temp = a;
//            a = b;
//            b = temp+a;
//        }
//        System.out.println(b);

        System.out.println(fibonacci(100));

    }

    static int fibonacci(int a){
        if (a<=2){
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }


    static int addAcc(int n){
        if (n==1){
            return 1;
        }
        return n+addAcc(n-1);
    }

}
