package C01Basic;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
////        List선언방법
//        ArrayList<String> myList1 = new ArrayList<String>();
//        ArrayList<String> myList2 = new ArrayList();
//
////        가장 일반적인 List선언방법
////        왼쪽엔 인터페이스, 오른쪽엔 구현체(클래스)
//        List<String> myList3 = new ArrayList<>();
//
////        초기값 생성방법1.
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//
////        초기값 생성방법2. 리스트를 주입
////        Arrays.asList는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> myList6 = new ArrayList<>(List.of(myArr));
//
//        int[] intArr = {10,20,30};
//        List<Integer> myList5 = new ArrayList<>(); // <> <- 제네릭이라고 부름
//        for(int i : intArr){
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        System.out.println(myList);
////        add(index,값) : 중간에 값 삽입
//        myList.add(0,30);
//        System.out.println(myList);

//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
////        특정리스트의 요소를 모두 add
//        myList2.addAll(myList2);
//
////        get : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
////        for문을 돌려 전체 list 출력
////        size() : 리스트의 길이(개수) 반환
//        for(int i=0; i<myList.size(); i++){
//            System.out.println(myList.get(i));
//        }

////        remove : 요소삭제
////        1)index를 통한 삭제 2)value를 통한 삭제
//        System.out.println(myList);
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
////        set(index, value) : 인덱스 위치의 자리에 value값 setting(변경)
//        myList.set(myList.size()-1, 10);
//        System.out.println(myList);
//
////        indexOf : 특정값이 몇번째 index에 위치한지 return.
////        가장 먼저 나오는 값의 index return.
//
//        System.out.println(myList.indexOf(10));

////        전체삭제 : clear()
////        isEmpty : 값이 비었는지, 안 비었는지
////        contains : 특정값이 있는지 없는지 확인
//        List<Integer> list = new ArrayList<>();
//        System.out.println(list.isEmpty());
//        list.add(10);
//        System.out.println(list.contains(20));

////        이중 리스트(리스트 안에 리스트)
//        List<List<Integer>> myList = new ArrayList<>();
//        [[1,2,3],[1,2], [5,6], [4]]
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>()); //리스트 명은 안써도 무관.
//        myList.get(0).add(10);
//        myList.get(0).add(20);
//        myList.get(1).add(1);
//        myList.get(1).add(2);
//        System.out.println(myList);
//
////        리스트안에 배열 : 배열사이즈 2,3,4개짜리 배열 3개 들어가는 것으로 add
////        2개(1,2), 3개(10,20,30), 4개(100,200,300,400)
//        List<int[]> myList2 = new ArrayList<>();
//        myList2.add(new int[2]);
//        myList2.add(new int[3]);
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{10,20,30});
//        myList2.add(new int[]{100,200,300,400});

////        리스트 정렬 : Collections.sort(), 리스트객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//
////        정렬1. Collections.sort()
//        Collections.sort(myList); //오름차순
//        Collections.sort(myList, Comparator.reverseOrder()); //내림차순
//
////        정렬2. 리스트객체.sort()
//        myList.sort(Comparator.naturalOrder()); //위의 sort와는 다른 컬렉션의 메서드다
//        myList.sort(Comparator.reverseOrder()); // 내림차순

////        프로그래머스 - n의 배수 고르기
//        int n=3;
//        int[] numlist = {4,5,6,7,8,9,10,11,12};
//        List<Integer>answerlist = new ArrayList<>();
//        for(int i=0; i<numlist.length; i++){
//            if(numlist[i] % n ==0){
//                answerlist.add(numlist[i]);
//            }
//        }
//        int[] answer = new int[answerlist.size()];
//        for (int i=0; i<answer.length; i++){
//            answer[i] = answerlist.get(i);
//        }
//        System.out.println(Arrays.toString(answer));

////        배열과 List간의 변환
////        1. String베열을 List<String>로 변환
//        String[] stArr = {"java", "python", "C++"};
////        1-1. Arrays.asList
//        List<String> stList1 = new ArrayList<>(Arrays.asList(stArr));
//
////        1-2. for문을 통해 담기
////        1-3. streamApi(참고만)
//        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());
//
////        2. List<String>을 String배열로 변환
////        2-1. for문을 통해 담기
////        2-2. toArray
//        String[] stArr2 = stList1.toArray(new String[stList1.size()]);
//
////        3.int배열을 List<Integer>로 변환
////        3-1. for문을 통해 담기
////        3-2. streamApi사용
//        int[] intArr = {10,20,30,40};
//        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList());



    }
}
