package C02ClassBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {
    public static void main(String[] args) {

        while (true) {
            System.out.println("어떤 서비스를 이용하시겠습니까?");
            System.out.println("1. 회원가입, 2. 회원목록 조회, " +
                    "3. 회원상세조회, 4. 게시글 작성, " +
                    "5. 게시글 목록 조회, 6. 게시글 상세조회");
            Scanner sc = new Scanner(System.in);
            int input = Integer.parseInt(sc.nextLine());

            if (input == 1){
                System.out.println("이름을 입력해 주세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력해 주세요.");
                String email = sc.nextLine();
                System.out.println("password를 입력해 주세요.");
                long password = sc.nextInt();


            }
            else if (input == 2) {

            }


        }


    }
static class Author{

    static long static_id = 0L;

    private long id;

    private String name;

    private String email;

    private long password;


    public Author(String name, String email, long password, long id, long static_id) {
        static_id +=1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public static long getStatic_id() {
        return static_id;
    }

    public long getId() {
        return id;
    }

    public long getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }





}

class Post{

    private String title;

    private  String contents;

    public void Post_id(long author_id, Author id){

    }



}




}

