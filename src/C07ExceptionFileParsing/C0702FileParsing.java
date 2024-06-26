package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.regex.Pattern;

public class C0702FileParsing {
    public static void main(String[] args) throws IOException {
////          콘솔에서 읽기
////        io패키지 사용
//        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
//        String input = br1.readLine(); //한줄을 읽기
//        System.out.println(input);

////        파일에서 읽기
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test_file.txt"));
//        String line = br2.readLine();
//        while (line != null){
//            System.out.println(line);
//            line = br2.readLine();
//        }

////        nio 패키지를 사용한 파일 처리
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");


//        try {
////        문자열 통쨰로 read
//
//            String st1 = Files.readString(filePath);
//            System.out.println(st1);
//
////        문자열을 각 라인을 잘라 list형태로 read
//            List<String> st2 = Files.readAllLines(filePath);
//            for (String s : st2) {
//                System.out.println(s + " 선수");
//            }
//
//        } catch (IOException e) {
//            e.getStackTrace();
//        }

//        파일 쓰기

//        append(추가), write(덮어쓰기)
//        create_new(생성)
        Path filePath = Paths.get("src/C07ExceptionFileParsing/test_file.txt");

        if (Files.exists(filePath)){
            Files.write(filePath, "홍길동\n".getBytes(), StandardOpenOption.APPEND); //텍스트 파일에 홍길동 추가하기
        } else {
            Files.write(filePath, "".getBytes(), StandardOpenOption.CREATE_NEW); //텍스트 파일 새로 만들기
        }




    }



}
