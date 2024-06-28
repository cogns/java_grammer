package C07ExceptionFileParsing.AuthorException;

import java.util.ArrayList;
import java.util.List;

public class AuthorRepository {

   private List<Author> authorList;

    AuthorRepository(){
        authorList = new ArrayList<>();
    }

    void register(Author author){
        this.authorList.add(author);
    }

    List<Author> getAuthorList(){
        return this.authorList;
    }
}
