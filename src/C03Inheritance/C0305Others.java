package C03Inheritance;

import java.util.LinkedList;
import java.util.List;

// 상속 불가
// public class C0305Others extends FinalParents{
public class C0305Others {
    public static void main(String[] args) {

        AbstractDog dog = new AbstractDog();

////        추상 클래스와 인터페이스는 구현없이 불가능
//        AbstractAnimal animal = new AbstractAnimal();
//        List<Integer> myList = new List<Integer>();

    }
}

//final을 클래스앞에 붙이면 상속 불가한 클래스 생성
final class FinalParents{

}

//추상 클래스
abstract class AbstractAnimal{
    void makeSound(){
        System.out.println("동물 소리를 냅니다.1");
    }

//    메서드 앞에 final이 붙으면 오버라이딩 불가
    final void makeSound2(){
        System.out.println("동물 소리를 냅니다.2");
    }

//    abstract키워드는 자식 클래스로 하여금 오버라이딩 강제
//    abstract메서드가 하나라도 있으면 반드시 클래스에도 abstract키워드가 붙어야함
//    리턴타입과 매개변수만 정의
    abstract void makeSound3();

}

class AbstractDog extends AbstractAnimal{
    @Override
    void makeSound3() {
        System.out.println("멍멍3");
    }
//    @Override
//    void makeSound2(){
//        System.out.println("멍멍2");
//    }
}