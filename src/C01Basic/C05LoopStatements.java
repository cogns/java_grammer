package C01Basic;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Long.reverse;
import static java.lang.Long.sum;

public class C05LoopStatements {
    public static void main (String[] args){
////        2부터 10까지 출력하는 while문
//
//        int a = 2;
//        while(a<11){
//            System.out.println(a);
//            a++;
//        }

////        입력한 숫자의 구구단 단수 출력
////        3 X 1 = 3
////        3 X 2 = 6
//        System.out.println("원하시는 단수를 입력해주세요.");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = 1;
//
//        while (b<10){
//            System.out.println(a+"X"+b+"="+(a*b));
//            b++;
//        }

////        도어락 입력초과문
//        int a = 0;
//        while (true){
//            String answer = "0011";
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//
//            if(answer.equals(input)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            } else{
//                System.out.println("비밀번호가 틀렸습니다.");
//            }
//            a++;
//            if
//        }
//
//            int num = 1234;
//            int result = 0;
////            result에 숫자 num을 반대로 뒤집은 숫자값을 넣어주세요.
////            나머지 %를 활용
//            while (num!=0){
//                result = result*10 + num%10;
//                num = num/10;
//        }
//        System.out.println(result);
////            결과값 : result=> 0+4 -> 40+3 -> 430+2 -> 4320+1
////                    num=> 123-> 12 -> 1 -> 0 end


////        do while문 : 무조건 한번은 실행되는 반복문 (많이 쓰이지는 않음)
//        int a=100;
//        do {
//            a++;
//            System.out.println(a);
//        }while (a<10);


////        for문

////        2~10까지 출력을 for문을 활용하여 출력
//        for(int i=2; i<11; i++){
//            System.out.println(i);
//        }

////        1~10중에 홀수만 출력하기
//        for(int i = 1; i<11; i++){
//            if(i%2 != 0){
//                System.out.println(i);
//            }
//        }

////        1~20까지의 수 중에 짝수를 모두 더한 값
//        for (int i = 1; i<21; i++){
//            if(i % 2 == 0){
//                total += i;
//            }
//            System.out.println(total);
//        }

////        최대공약수 구하기
//        int a =24; int b =36;
//        int max = a>b ? a:b;
//        int answer = 0;
//        for(int i =1; i<=max; i++ ){
//            if(a%i ==0 && b%i ==0){
//                answer = i;
//            }
//        }
//        System.out.println(answer);

////           소수구하기 : 1과 자기자신을 제외한 숫자로 나누어지지 않는 수
////           1~24까지 수 중에 소수를 출력
//        for(int input = 2; input<=24; input++){
//            boolean tureOrNot = false;
//            for(int i = 2; i<a; i++){
//            if(a%i ==0){
//                tureOrNot = true;
//                break;
//
//        }


////              사용자가 입력한 특정값이 소수인지 아닌지
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        boolean tureOrNot = false;
//        for(int i = 2; i<a; i++){
//            if(a%i ==0){
//                tureOrNot = true;
//                break;
//            }
//        }if(tureOrNot == false){
//            System.out.println("소수입니다.");
//        }else {
//            System.out.println("소수가 아닙니다.");
//        }

////        continue : 그냥 가독성이 더 좋아진다. 그게 끝. 하지만 코드가 복잡해지면 언젠가는 쓰인다.
//        for(int i = 1; i<11; i++){
//            if(i%2 == 0){
//                continue;
//            }
//                System.out.println(i);

////        배열과 enhanced for문(향상된 for문 - for each문)
//        int[] arr = {1,3,5,7,9};
////        일반 for문
//        for(int i=0; i<5; i++){
//            System.out.println(arr[i]);
//        }
//
////        향상된 for문 : 반복횟수는 arr에 들어가있는 데이터 개수 만큼 반복.
//        for(int i : arr){
//            System.out.println(i);
//        }

////        System.out.println(arr); 메모리 주소값 출력됨.
//
////        일반 for문을 통한 arr값 변경 후 출력
//        for(int i=0; i<5; i++){
//            arr[i] += 10;
//        }
//        System.out.println(Arrays.toString(arr)); //메모리 주소출력이 내용출력
//
////        향상된 for문을 통한 arr값 변경 후 출력
//        for(int i : arr){
//            i +=10;
//        }
//        System.out.println(Arrays.toString(arr));
//
////        자바 변수의 유효범위 : {}
//        int num= 10;
//        if(num>1){
//            int abc = 10;
//            num = 20;
//        }
//        abc = 30; if문 중괄호 밖에서는 abc변수의 존재를 모름
//        System.out.println(num);
//        System.out.println(abc);

////        다중반복문 : 2X1 =2
////        각 단마다 몇단입니다. 출력
//        for(int i=1; i<10; i++){
//            System.out.println(i+"단 입니다.");
//            for(int j=1; j<10; j++){
//                System.out.println(i+"X"+j+"="+(i*j));
//            }
//        }

//        //프로그래머스 직사각형 별만들기
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        for(int i = 0; i<m; i++){
//            for(int j =0; j<n-1; j++){
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }

////        라벨문
//        loop1:
//        for(int i =0; i<5; i++){
//            boolean test = false;
//            for(int j=0; j<5; j++){
//                System.out.println("hello World");
//                if(j==2){
//                    break loop1;
//                }
//            }
//        }

//        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
//        System.out.println(arr[0]); // 여기서 0번째는 {1,2,3}
//        System.out.println(arr[1][3]); // 여기서 1번쨰 배열에 3번째 값 = 6


////        라벨문 활용해서 값찾기
////        11을 찾으면 3,1에 11이 있습니다. 라고 출력
//        int[][] arr = {{1,2,3}, {4,5,11}, {7,8,9}, {10,11,12}};
//        int target = 11;
//        loop1:
//        for(int i =0; i<4; i++){
//            for(int j =0; j<3; j++){
//                if(arr[i][j]==target){
//                    System.out.println(i+","+j+"에 "+target+"이 있습니다.");
//                    break loop1;
//                }
//
//            }
//        }

    }
}
