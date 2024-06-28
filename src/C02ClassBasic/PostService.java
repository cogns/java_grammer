package C02ClassBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PostService {
    public static void main(String[] args) {
        List<Author> authors = new ArrayList<>();
        List<Post> posts = new ArrayList<>();

        while (true){
            System.out.println("게시판 서비스 입니다.");
            System.out.println( "1. 회원가입, 2. 2. 회원목록 조회, 3. 회원 상세 조회, " +
                    "4. 게시글 작성, 5. 게시글 목록 조회, 6. 게시글 상세 조회");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1){
                System.out.println("이름을 입력 하세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력 하세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력 하세요.");
                int password = Integer.parseInt(sc.nextLine());

                Author author = new Author(name, email, password);
                authors.add(author);
            } else if (number == 2){
                System.out.println("회원목록 조회 서비스 입니다.");
                for (int i=0; i< authors.size(); i++){
                    System.out.print("이름 : "+authors.get(i).getName()+"   ");
                    System.out.println("이메일 : "+authors.get(i).getEmail());
                }
            } else if (number == 3) {
                System.out.println("회원목록 상세 조회 서비스 입니다.");
                System.out.println("아이디를 입력해 주세요.");
                int id_number = Integer.parseInt(sc.nextLine());
                for (int i=0; i< authors.size(); i++){
                    if (id_number == authors.get(i).getId()){
                        System.out.print("ID : "+authors.get(i).getId()+"   ");
                        System.out.print("이름 : "+authors.get(i).getName()+"   ");
                        System.out.print("이메일 : "+authors.get(i).getEmail()+"   ");
                        System.out.println("비밀번호 : "+authors.get(i).getPassword());
                    }
                }
            } else if (number == 4) {
                System.out.println("게시글을 작성할 이메일을 입력해 주세요.");
                String email = sc.nextLine();

                for (int i=0; i< authors.size(); i++){
                    if (email.equals(authors.get(i).getEmail())){
                        System.out.println("게시글 작성을 시작 합니다.");
                        System.out.println("제목을 입력해 주세요.");
                        String title = sc.nextLine();
                        System.out.println("내용을 입력해 주세요.");
                        String contents = sc.nextLine();

                        Post post = new Post( title, contents, email);
                        posts.add(post);
                        System.out.println("게시글이 작성 되었습니다.");
                    }
                }
            } else if (number == 5) {
                System.out.println("게시글 목록 조회 서비스 입니다.");
                for (int i=0; i< posts.size(); i++){
                    System.out.println();
                }
            }


        }





    }
static class Author{

    static long static_id = 0L;

    private long id;

    private String name;

    private String email;

    private long password;

    //회원가입
    public Author(String name, String email, long password) {
        static_id +=1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

//    Getter
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



 static class Post{

    static long static_id = 0L;

    static long id;

    private String title;

    private  String contents;

    private String email;


//    게시글 작성
    public Post(String title, String contents, String email){
        static_id += 1;
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.email = email;

    }

//    Getter


    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public String getEmail() {
        return email;
    }

    public static long getId() {
        return id;
    }
}




}

