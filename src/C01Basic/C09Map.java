package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("soccer", "축구");
//        myMap.put("basetball", "야구");
//        System.out.println(myMap);
//        System.out.println(myMap.get("soccer"));
//        myMap.put("baseball", "크리캣"); //덮어쓰기
////        baseball을 map에서 검색하는 복잡도 0(1)<- 이게 속도가 제일 빠름
//        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");


////        putIfAbsent
//        myMap.putIfAbsent("basketball", "배구");
//        System.out.println(myMap.get("basketball"));
////        getOrDefault : key가 없으면 default값 return
//        System.out.println(myMap.getOrDefault("baseball", "비어있음"));
//        System.out.println(myMap.containsKey("baseball"));


//        String[] arr = {"농구", "농구", "배구", "야구", "배구"};
////        농구:2, 배구:2, 야구:1 로 변경
//        Map<String, Integer> myMap = new HashMap<>();
//        for(String a : arr){
////            if(myMap.containsKey(a)){
////                myMap.put(a, myMap.get(a)+1);
////            }else {
////                myMap.put(a,1);
////            } //or
//            myMap.put(a, myMap.getOrDefault(a, 0)+1); //this
//        }
//        System.out.println(myMap);
//
////        keySet() : 키목록을 set형태로 반환
////        values() : value목록을 반환
//
////        enhanced for문(향상된 for문)을 통해 key값 하나씩 출력
//        for (String a : myMap.keySet()){
//            System.out.println(a);
//            System.out.println(myMap.get(a));
//        } //or
//        for (int a : myMap.values()){
//            System.out.println(a);
//        }
//
////        iterator를 통해 key값 하나씩 출력
//        Iterator<String> myIter =  myMap.keySet().iterator();
////        next()메서드는 데이터를 하나씩 소모시키면서 return
//        System.out.println(myIter.next());

////        hasNext() : iterator안에 값이 있는지 없는지 boolean return
//        while (myIter.hasNext()){
//            System.out.println(myIter.next());
//        }


////       프로그래머스 - 완주하지 못한 선수 //풀어보기
//
//        String[] participant = {"leo", "kiki", "eden"}; //마라톤에 참여한 선수들의 이름
//        String[] completion = {"eden", "kiki"}; //완주한 선수들의 이름
//        String answer = ""; //완주하지 못한 선수의 이름
//        Map<String, Integer> partiMap = new HashMap<>();
//        for (String p : participant){
//            partiMap.put(p, partiMap.getOrDefault(p, 0)+1);
//        }
//        for (String c : completion){
//            if (partiMap.containsKey(c)){
//                partiMap.remove(c);
//            }else {
//                partiMap.put(c, partiMap.get(c)-1);
//            }
//        }for (String a : partiMap.keySet()){
//            answer = a;
//        }
//        System.out.println(answer);

////        프로그래머스 - 의상  미완성
//        int answer = 0;
//        String [][] clothes = {
//                {"yellow_hat", "headgear"},
//                {"blue_sunglasses", "eyewear"},
//                {"green_turban", "headgear"}};


////        LinkedHashMap : 데이터 삽입순서 유지
//        Map<String, Integer> linkedMap = new LinkedHashMap<>();
//        linkedMap.put("hello5", 1);
//        linkedMap.put("hello4", 1);
//        linkedMap.put("hello3", 1);
//        linkedMap.put("hello2", 1);
//        linkedMap.put("hello1", 1);
//        System.out.println(linkedMap);

////        TreeMap : key를 통해 데이터를 정렬(최적화)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 1);
//        treeMap.put("hello3", 1);
//        treeMap.put("hello2", 1);
//        treeMap.put("hello1", 1);
//        System.out.println(treeMap);

////        프로그래머스 - 문자열 내 마음대로 정렬하기  //풀어보기
//        String[] strings = {"sun", "bed", "car"};
//        String[] answer = new String[strings.length];
//        int n = 1;
//        Map<String, String> map = new TreeMap<>();
//        for (String a: strings){
//            map.put(a.charAt(n)+a, a);
//        }
//        int count = 0;
//        for (String a : map.values()){
//            answer[count] = a;
//            count++;
//        }
//        System.out.println(Arrays.toString(answer));



    }
}
