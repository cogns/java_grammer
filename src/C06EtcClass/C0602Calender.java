package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C0602Calender {
    public static void main(String[] args) {
////        java.util 패키지의 Calender클래스
//        Calendar calendar = Calendar.getInstance();
//        System.out.println(calendar.getTime()); //현재시각
//
//        System.out.println(calendar.get(Calendar.YEAR)); //현재년도
//        System.out.println(calendar.get(Calendar.MONTH)+1); //몇월
//        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); //며칠
//        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); //몇 주차
//        System.out.println(calendar.get(Calendar.HOUR_OF_DAY)); //시
//        System.out.println(calendar.get(Calendar.MINUTE)); //분
//        System.out.println(calendar.get(Calendar.SECOND)); //초


////        java.time패키지 : Local~클래스
////        날짜(LocalDate) : date타입, 시간(LocalTime), 날짜와 시간(LocalDateTime) : datetime타입
//        LocalDate presentDate = LocalDate.now();
//        System.out.println(presentDate); //현재 날짜
//        System.out.println(presentDate.getYear()); //년도
//        System.out.println(presentDate.getMonth()); //월(영문)
//        System.out.println(presentDate.getDayOfMonth()); //일
//        System.out.println(presentDate.getDayOfWeek()); //요일(영문)


//        LocalTime presentTime = LocalTime.now();
//        System.out.println(presentTime); //현재시,분,초
//        System.out.println(presentTime.getHour()); //시
//        System.out.println(presentTime.getMinute()); //분
//        System.out.println(presentTime.getSecond()); //초


//        LocalDateTime presentDateTime = LocalDateTime.now();
//        System.out.println(presentDateTime); //날짜, 시분초
//        System.out.println(presentDateTime.getYear()); //년도
//        System.out.println(presentDateTime.getHour()); //시


////        임의로 특정 시간을 만들어 내고 싶을때 : of메서드 사용
//        LocalDate birthDay = LocalDate.of(1999, 11 ,3);
//        System.out.println(birthDay.getYear()); //1999
//        System.out.println(birthDay.getMonth()); //11(영문)
//        System.out.println(birthDay.getDayOfMonth()); //3
//
//        LocalTime birthTime = LocalTime.of(20, 15, 50);

        LocalDateTime birthDayTime = LocalDateTime.of(
                1999, 11, 3, 20, 15, 50);
//        매개변수로 크로노필드 enum타입 사용하야 프로그램의 유연성 향상
        System.out.println(birthDayTime.get(ChronoField.YEAR));
        System.out.println(birthDayTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(birthDayTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(birthDayTime.get(ChronoField.HOUR_OF_DAY));
//        0 : 오전, 1 : 오후
        myWatch(LocalDateTime.now(), ChronoField.YEAR);
        myWatch(LocalDateTime.now(), ChronoField.AMPM_OF_DAY);



    }

    static void myWatch(LocalDateTime localDateTime, ChronoField c){
        if(c==ChronoField.YEAR) {
            System.out.println("연도는 " + localDateTime.get(c) + "입니다");
        }
        else if (c == ChronoField.MONTH_OF_YEAR) {
            System.out.println("월은 " + localDateTime.get(c) + "입니다");
        }
        else if(c==ChronoField.AMPM_OF_DAY){
            if(localDateTime.get(c)==0){
                System.out.println("오전입니다");
            }
            else {
                System.out.println("오후입니다");
            }

        }
    }

}
