package C01Basic;

import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
////        배열 표현식1 : 리터럴방식
////        in[] intArr1 = {1, 2, 3, 4, 5};
//
////        배열 표현식2 : 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5];
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); //0으로 초기화
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


    }
}