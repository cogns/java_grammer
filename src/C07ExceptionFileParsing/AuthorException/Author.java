package C07ExceptionFileParsing.AuthorException;

public class Author {


    static long static_id = 0L;

    private long id;

    private String name;

    private String email;

    private String password;

    //회원가입
    public Author(String name, String email, String password) {

//        if (password <=5){
//            throw new IllegalArgumentException("비밀번호가 너무 짧습니다.");
//        }

        static_id += 1;
        this.id = static_id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //    Getter

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}



