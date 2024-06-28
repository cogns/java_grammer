package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////        배열 표현식1 : 리터럴방식
//        int[] intArr1 = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(intArr1));
//
////        배열 표현식2 : 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
////        System.out.println(intArr2[4]); //0으로 초기화
//        for(int i=0; i<intArr2.length; i++){
//            System.out.println(intArr2[i]);
//        }
//        for(int i : intArr2){
//            System.out.println(i);
//        }
//
////        배열 표현식3
//        int[] intArr3 = new int[]{1,2,3,4};
//
////        배열 표현식4 : 불가 -> 배열의 길이는 사전에 지정되어야함
//        int[] intArr4 = new int[];

//        String[] stArr1 = new String[5];
//        stArr1[0] = "hello";
//        stArr1[1] = "java";
////        null pointer exception
//        System.out.println(stArr1[2].length());
//
//        String[] stArr2 = new String[5];
////        배열에 값 한꺼번에 세팅
//        Arrays.fill(stArr2, "");
//        System.out.println(stArr2[3]);

////        85, 65, 90인 int배열을 선언하고 총합, 평규을 구해보자.
//        int[] starr1 = {85, 65, 90};
////        int sum = starr1[0]+starr1[1]+starr1[2];
////        System.out.println(sum);
////        System.out.println(sum/3);

//        int sum = 0;
//        for(int i=0; i<starr1.length; i++){
//            sum += starr1[i];
//        }int avg = sum/starr1.length;

////        최대값, 최소값
//        int[] arr = {10, 20, 30, 12, 8, 17};
//        int max = arr[0]; //int max = Integer.MIN_VALUE로도 세팅 가능.
//        int min = arr[0]; //int max = Integer.MAX_VALUE로도 세팅 가능.
//        for(int i=0; i<arr.length; i++){
//            if(max<arr[i]){
//                max=arr[i];
//            }if (min>arr[i]) {
//                min=arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);


////        배열의 순서바꾸기
//        int[] arr = {10,20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr2 = {10,20,30,40,50};
////        0번째 index부터 마지막 index까지 순차적으로 자리 체인지
//        for(int i=0; i<arr2.length-1; i++){
//            int temp = arr2[i];
//            arr2[i] = arr2[i+1];
//            arr2[i+1] = temp;
//        }
//        System.out.println(Arrays.toString(arr2));

////        배열 뒤집기
//        int[] arr = {1,2,3,4,5};
////        새로운 배열에 위 arr을 뒤집은 값 세팅
//        int[] newArr = new int[arr.length];
//        int num = arr.length-1;
//        for(int i=0; i<arr.length; i++){
//            newArr[num-i] = arr[i];
//
//        }
//        System.out.println(Arrays.toString(newArr));


////        숫자 뒤집기
//        int num=1234;
////        문자열과 관련된 풀이로 풀기
////        최종 : 4321 문자열로 출력되도록
//        String stNum = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int count = stNum.length()-1;
//        for(int i=0; i<stNum.length(); i++){
//            sb.append(stNum.charAt(count-i));
//        }
//        System.out.println(sb);

////        정렬
//        int[] arr = {5,1,2,7,3,1,2};
//        Arrays.sort(arr); //오름차순 정렬이 기본.
//        System.out.println(Arrays.toString(arr));

////        문자정렬
////        아스키코드 기준으로 => 대문자가 소문자보다 아스키코드가 낮다.
//        String [] fruits = {"banana", "apple", "cherry", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));
//
////        문자열의 index순서로 비교
//        String [] fruits2 = {"apple1", "apple11", "apple2"}; //2보다 11이 먼저 나옴(앞자리부터 비교하기 때문)
//        Arrays.sort(fruits2);

////        내림차순
//        String [] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());
//        System.out.println(Arrays.toString(st_arr));
//
////        기본형타입은 Comparator로 처리 불가
//        int[] intArr = {5,1,2,7,3,1,2};
//        Arrays.sort(intArr);
////        방법 1: 오름차순 정렬 후 배열뒤집기
//
////        방법 2 : streamapi, lambda를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(intArr) //intArr을 대상으로 Stream객체 생성
//                            .boxed() //int요소를 Integer로 형변환 시키는 메서드
//                            .sorted(Comparator.reverseOrder())
//                            .mapToInt(a->a) //Integer를 int로 형변환
//                            .toArray(); //배열로 변환

//        프로그래머스 k번째수

////        선택정렬 알고리즘
//        int[] arr = {17,20,19,25,12}; //for문으로 내림차순 정렬
//
//        for(int i=0; i<arr.length-1; i++){
//            for(int j=i+1; j<arr.length; j++){
//                if(arr[i] > arr[j]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

////        숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때,
////        만들어질 수 있는 2개의 조합의 합을 출력
//        int[] intArr = {10,20,30,40,50};
//        int[] arr = {};
//        for(int i=0; i<intArr.length; i++){
//            for(int j=i+1; j<intArr.length; j++){
//                System.out.println(intArr[i]+intArr[j]);
//            }
//        }

////        배열의 복사
////        copyOf(배열, lenth), copyOfRange(배열, start, end)
//        int[] arr = {10,20,30,40,50};
//        int[] newArr1 = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr1));
//        int[] newArr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(newArr2));

////        배열의 중복 제거
//        int[] temp = {10, 10, 5, 7, 40, 40, 10, 10};
////        List, set도 쓰지 말고 중복제거
//        Arrays.sort(temp);
//        int[] arr = new int[temp.length];
//        int num = 0;
//        for (int i = 0; i < temp.length; i++) {
//            if (i==0 || temp[i] != temp[i-1]) {
//                arr[num] = temp[i];
//                num++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(arr, 0, num);
//        System.out.println(Arrays.toString(answer));

////        프로그래머스 - 두개 뽑아서 더하기             미완성
//        int[][] numbers = {{2,1,3,4,1}, {5,0,2,7}};
//
//        int [] result = new int[]{};
//        int num = 0;
//        for(int i=0; i<numbers.length; i++){
//            for(int j =0; j<numbers[i].length; j++){
//                for(int k =j+1; k<numbers[i].length; k++)
//                result[i] = numbers[i][j]+numbers[i][k];
//            }
//        }

//        int[] numbers = {2,1,3,4,1};
//        int[] temp = new int[numbers.length*numbers.length];
//        int count = 0;
//        for(int i=0; i<numbers.length; i++){
//            for(int j=i+1; j<numbers.length; j++){
//                temp[count] = numbers[i] + numbers[j];
//                count++;
//            }
//        }
//        temp = Arrays.copyOf(temp, count);
//        Arrays.sort(temp);
//        System.out.println(Arrays.toString(temp));

////        배열의 검색
//        int[] arr = {5,3,1,8,7};
//        int num = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] ==8){
//                num =i;
//                break;
//            }
//        }
//        System.out.println(num);

////        이진검색(Binary Search) -이분탐색
////        복잡도 0(logn)
//        int[] arr = {1,3,6,8,9,11,15};
////        사전에 오름파순 정렬이 되어 있어야 이진검색 가능
//        System.out.println(Arrays.binarySearch(arr, 15));

////        배열간 비교
//        int[] arr1 = {10,20,30};
//        int[] arr2 = {10,20,30};
//        System.out.println(arr1==arr2);
////        Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1,arr2));

////        2차원배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;
//        System.out.println(Arrays.deepToString(arr));
//
////        리터럴 방식으로 할당
//        int[][] arr2 = {{1,2,3}, {4,5,6}};
////        {{1,2,3}, {4,5,6}}
//
////        2차원 배열의 출력
//        System.out.println(Arrays.deepToString(arr2));

////        2차원 기변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//
////        가변배열 리터럴 방식
//        int[][] arr2 = {{10,20}, {10,20,30}};

////        [3][4]사이즈 배열을 선언한 뒤
////        1~12까지 숫자값 각 배열에 할당 후 출력
////        {1,2,3,4}, {5,6,7,8}, {9,10,11,12}
//        int[][] arr = new int[3][4];
//        int count = 1;
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

////        프로그래머스 - 행렬의 덧셈
//        int [][] arr1 = {{1,2}, {2,3}, {1}, {2}};
//        int [][] arr2 = {{3,4}, {5,6}, {3}, {4}};
//        int[][] answer = new int[arr1.length][arr1[0].length];
//        for(int i=0; i< arr1.length; i++){
//            for(int j=0; j<arr1[i].length; j++){
//                answer[i][j] = arr1[i][j]+arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(answer));

////        가변배열실습 : 행의길이(전체배열의길이)5 =>{{10}, {20,20}, {30,30,30}, {40,40,40,40}, {50,50,50,50,50}};
////        for문으로 만들기
//        int[][] arr = new int[5][];
//        for(int i=0; i<arr.length; i++){
//            arr[i] = new int[i+1];
//            for(int j=0; j<arr[i].length; j++){
//                arr[i][j] = (i+1)*10;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));

    }
}