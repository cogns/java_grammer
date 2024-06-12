package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
//        어떤 숫자값이 소수인지 아닌지 판별하는 메서드 생성 =>리턴타입은 boolean, 매개변수는 int 숫자
//        main메서드 안에서 해당 메서드 호출해서 판별 출력
//        if(참) 소수입니다. else 거짓입니다.

        if (isPrimePrint(10)){
            System.out.println("소수입니다.");
        }else {
            System.out.println("소수가 아닙니다.");
        }

    }
    public  static boolean isPrimePrint(int num){
//        소수면 true, 소수가 아니면 false
        for (int i=2; i*i<=num; i++){
            if (num%i == 0){
//                checked = false;
//                break;
//                메서드는 return을 만나면 바로 종료
//               void리턴타입에서도 메서드 강제 종료를 위해 return 사용
                return false;
            }
        }
        return true;

    }


}
