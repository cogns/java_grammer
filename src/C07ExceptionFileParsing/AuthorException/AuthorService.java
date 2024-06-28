package C07ExceptionFileParsing.AuthorException;

import java.util.List;

public class AuthorService {
   private AuthorRepository authorRepository;

    AuthorService(){
        authorRepository = new AuthorRepository();
    }

    public void register(String name, String email, String password){
        Author  author = new Author(name, email, password);
        authorRepository.register(author);

    }

    public void login(String email, String password)throws IllegalArgumentException{
//        해당하는 이메일이 맞는지 : authorList 목록조회
//        그 이메일의 비밀번호가 맞는지
        List<Author> authorList =  authorRepository.getAuthorList();
        boolean emailNotfound = false;
        boolean passwordNotEqual = false;
        for (Author a : authorList) {
            emailNotfound = true;
            if (a.getEmail().equals(email)) {
                emailNotfound = true;
                if (a.getPassword().equals(password)) {
                    passwordNotEqual = true;
                }
            }
        }
        if (emailNotfound ==false){
            throw new IllegalArgumentException("없는 이메일 입니다.");
        }
        if (passwordNotEqual == false){
            throw new IllegalArgumentException("없는 비밀번호 입니다.");
        }

    }

}
