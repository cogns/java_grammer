package C01Basic;

import java.util.Scanner;

public class C04IfStatements {
    public static void main (String[] args) {

//        도어락키 if문
        int answer = 1234;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(answer == input){
            System.out.println("문이 열렸습니다.");
        } else {
            System.out.println("비밀번호가 틀렸습니다.");
        }

////        알파벳이 소문자인지 대문자인지 판별하는 프로그램
////        (힌트) 묵시적 타입변환 'b'>'a'
////        소문자 알파벳, 대문자 알파벳, 그 외
//
//        Scanner sc = new Scanner(System.in);
//        char ch1 = sc.nextLine().charAt(0);
//
//        if(ch1 >= 'a' && ch1 <= 'z'){
//            System.out.println("소문자 입니다.");
//        } else if (ch1 >='A' && ch1 <='Z') {
//            System.out.println("대문자 입니다.");
//        } else {
//            System.out.println("그 외 입니다.");}

////        택시요금 : 10000, 버스요금 : 3000, 킥보드 : 2000
////        사용자에게 얼마가 있는지 물어보고 구간별로 교통수단 추천
//
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//
//        if(input >= 10000){
//            System.out.println("택시");
//        } else if (input < 10000 && input >=3000) {
//            System.out.println("버스");
//        } else if (input < 3000 && input >=2000) {
//            System.out.println("킥보드");
//        }else {
//            System.out.println("걸어가");
//        }
//
////        if문 독립적으로 존재할 경우에는 정확한 범위지정을 하지 않으면,
////        모든 if문이 충족되어 츌력 될 가능성이 존재.


////        삼황연산자
//          간단한 if / else 문은 삼항 연산자를 이용하여 간결하게 표현
//        int answer = 1234;
//        System.out.println("비밀번호를 입력하시오");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        String result = (answer == input) ? "문이 열렸습니다." : "비밀번호가 틀렸습니다.";;
//        System.out.println(result);


////        swich문 : if else if 등의 조건물을 가독성있게 표현 구문
//        System.out.println("원하시는 서비스 번호를 입력하시오.");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
////        1번을 누르면 대출업무입니다. , 2번을 누르면 예금업무입니다. , 3번을 누르면 적금업무입니다.
////        0번을 누르면 상담사연결입니다. 그 외는 잘못누르셨습니다.
//        switch (input){
//            case 1 :
//                System.out.println("대출업무입니다.");
//                break;
//            case 2 :
//                System.out.println("예금업무입니다.");
//                break;
//            case 3 :
//                System.out.println("적금업무입니다.");
//                break;
//            case 0 :
//                System.out.println("상담사연결입니다.");
//                break;
//            default:
//                System.out.println("잘못누르셨습니다.");
//                break;
//
        }


    }

