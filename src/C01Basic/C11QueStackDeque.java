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

////        LinkedList와 ArrayList비교
////        LinkedList의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for (int i=0; i<100000; i++){
//            list1.add(0, 10);
//        }
//        long endTime = System.currentTimeMillis();
//        System.out.println("linklist의 중간 삽입 : " +(endTime - startTime));
//
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
        int[] scoville = {1, 2, 3, 9, 10, 12};

        int k = 7;
        int sum = 0;
        int answer = 0;

        for (int i=0; i< scoville.length; i++){
            if (sum<=k){
                sum += scoville[i] + (scoville[i + 1] * 2);
                answer++;
            }else {
                break;
            }
        }
        System.out.println(answer);



    }
}
