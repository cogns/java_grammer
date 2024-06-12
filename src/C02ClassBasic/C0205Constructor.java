package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calendar cal = new Calendar("2024", "06", "12");
//        cal.setYear("2024");
//        cal.setMonth("06");
//        cal.setDay("12");
        System.out.println("오늘은 "+cal.getYear()+"년 "+ cal.getMonth()+"월 "+ cal.getDay()+ "일 ");
    }
    static class Calendar{
        private String year;
        private String month;
        private String day;

//        생성자 : 클래스명과 동일, 초기화하고 싶은 변수명 나열
//        별도의 생성자를 만들경우, 초기생성자를 따로 선언 필요
        Calendar(String year, String month, String day){
            this.year = year;
            this.month = month;
            this.day = day;
        }
//        같은 클래스 내의 다른 생성자 호출시 this() 사용
        Calendar(String year, String month){
            this(year, month, null);
        }
        Calendar(){
        }

//        public void setYear(String year) {
//            this.year = year;
//        }
//
//        public void setMonth(String month) {
//            this.month = month;
//        }
//
//        public void setDay(String day) {
//            this.day = day;
//        }

        public String getYear() {
            return year;
        }

        public String getMonth() {
            return month;
        }

        public String getDay() {
            return day;
        }
    }
}
