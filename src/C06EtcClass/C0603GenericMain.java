package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr)); //python, java, C

        Integer[] intArr = {10,20,30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr)); //20, 10, 30

        genericChange(stArr, 1,2);
        System.out.println(Arrays.toString(stArr)); //python, C, java

        Person p1 = new Person();
        p1.setValue("kwonchaehun");

        GenericPerson<Integer> p2 = new GenericPerson();
        p2.setValue(10);

//        제네릭 사용
        List<String> myList = new ArrayList<>();
        myList.add("hello");
        myList.add("java");

//        컴파일 후 제네릭 소거
//        List myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");

    }

//    제네릭메서드 생성 : 반환타입 왼쪽에 <T> 선언
//    유의점 : 제네릭은 객체 타입이 들어와야함
    static <T> void genericChange(T[] stArr, int a, int b){
        T temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    static void stChange(String[] stArr, int a, int b){
        String temp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = temp;
    }

    static void intChange(Integer[] intArr, int a, int b){
        Integer temp = intArr[a];
        intArr[a] = intArr[b];
        intArr[b] = temp;
    }
}

// 코드 중복을 막기 위해 타입도 넘겨주게 만드려면 제네릭
//제네릭 클래스는 클래스명 오른쪽에 <T>선언

class GenericPerson<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}



class Person{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}