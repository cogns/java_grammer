package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C0207Permu {
    static List<Integer> myList;

    static List<List<Integer>> answer;
    static int count;
    static boolean[] visited;
    public static void main(String[] args) {
        myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        myList로 만들 수 있는 2개짜리 숫자 조합을 이중리스트에 담기
//        3개 조합은 3중 for문을 사용하면됨
//        하지만 n개의 조합을 구하려면 ??


        count = 2;
        answer = new ArrayList<>();
        visited = new boolean[myList.size()];

        permu(new ArrayList<>());
        System.out.println(answer);
    }
    static void combinations(List<Integer>temp , int start) {
        if (temp.size() == count) {
//            temp를 그대로 add할 경우, temp의 메모리값이 add되므로, 모든 answer 리스트에 같은 temp리스트가 add된다
//            answer.add(temp);
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i=start;i< myList.size();i++) {
            temp.add(myList.get(i));
            combinations(temp,i+1);
            temp.remove(temp.size()-1);
        }
    }
    static void permu(List<Integer>temp) {
        if (temp.size() == count) {
            answer.add(new ArrayList<>(temp));
            return;
        }
        for (int i=0;i< myList.size();i++) {
            if(!visited[i]) {
                visited[i] = true;
                temp.add(myList.get(i));
                permu(temp);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
}
