package C07ExceptionFileParsing.AuthorException;

import C02ClassBasic.PostService;
import C07ExceptionFileParsing.C0701Exception;

import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while (true){
            System.out.println("1. 회원가입, 2. 로그인");
            Scanner sc = new Scanner(System.in);
            int number = Integer.parseInt(sc.nextLine());
            if (number == 1){
                System.out.println("이름을 입력 하세요.");
                String name = sc.nextLine();
                System.out.println("이메일을 입력 하세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호를 입력 하세요.");
                String password = sc.nextLine();

                authorService.register(name, email, password);

            } else if (number == 2) {
                System.out.println("이메일을 입력 하세요.");
                String email = sc.nextLine();
                System.out.println("비밀번호을 입력 하세요.");
                String password = sc.nextLine();
                try {
                    authorService.login(email, password);
                }catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }

            }


        }



    }


}
