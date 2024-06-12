package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue); //10,20,30
//        System.out.println(myQue.poll()); //10
//        System.out.println(myQue.peek()); //20
//        System.out.println(myQue); //20,30

////        LinkedList와 ArrayList 성능 테스트 비교

////        LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i=0; i<100000; i++){
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linklist의 중간 삽입 : " +(endTime - startTime));
//
//        ArrayList의 add
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for (int i=0; i<100000; i++){
//            list1.add(0, 10);
//        }
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("Arraylist의 중간 삽입 : " +(endTime2 - startTime2));


//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

////        ArrayBlockingQueue : 길이제한큐
//        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        add를 사용하면 길이제한 초과시 예외 발생
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40"); //에러처리 됨.

//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");
//        System.out.println(queue);

////        우선순위큐 : 데이터를 꺼낼 떄 정렬된 데이터 pop
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//        System.out.println(pq);
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

////        프로그래머스 - 더 맵게 //특정 숫자들을 꺼내서 재조립하여 다시 집어넣고, 다시 꺼내서 재조립하는걸 반복
//        int[] scoville = {1, 2, 3, 9, 10, 12};


////        stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//
////        pop : 스택에서 요소를 제거 후 해당 요소 반환
//        System.out.println(st1.pop());
//        System.out.println(st1.peek()); //20
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());

////        String객체 5개정도 Stack추가후애 while문을 통해 출력
//        Stack<String> st1 = new Stack<>();
//        st1.push("a");
//        st1.push("b");
//        st1.push("c");
//        st1.push("d");
//        st1.push("e");
//        while (!st1.isEmpty()){
//            System.out.println(st1.pop());
//        }

////        프로그래머스 - 같은 숫자는 싫어
//        int []arr = {1,1,3,3,0,1,1};
//        Stack<Integer> st2 = new Stack<>();
//        for (int a : arr){
//            if (st2.isEmpty()){
//                st2.push(a);
//            }else {
//                if (st2.peek() !=a){
//                    st2.push(a);
//                }
//            }
//        }
//        System.out.println(st2);

//        my code list로 풀어도 됌

//        for (int i=0; i< arr.length; i++){
//            st2.push(arr[i]);
//        }
//        for (int i=0; i<st2.size(); i++){
//            st2.pop();
//            if (st2.pop()!=st2.peek()){
//                answer[i] = st2.pop();
//            }
//        }
//        System.out.println(Arrays.toString(answer));


////        프로그래머스 - 올바른 괄호
//        String s = "()()";
//        char[] sChar = s.toCharArray();
//        boolean answer = true;
//        if (sChar[0]=='(' && sChar[sChar.length-1]==')'){
//            System.out.println(answer);
//        }else {
//            answer = false;
//            System.out.println(answer);
//        }

//        Deque
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10); //마지막에 10 추가
        d1.addLast(20);
        System.out.println(d1); //[10, 20]
        d1.addFirst(30); //처음에 30 추가
        System.out.println(d1); //[30, 10, 20]

        System.out.println(d1.peekFirst()); //30
        System.out.println(d1.peekLast()); // 20

        System.out.println(d1.pollFirst()); //poll
        System.out.println(d1.pollLast()); // pop

//        프로그래머스 - 다리를 지나는 트럭       //한번 풀어볼것

        //하이


    }
}
