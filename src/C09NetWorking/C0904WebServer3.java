package C09NetWorking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.sql.*;

public class C0904WebServer3 {
    public static void main(String[] args) throws IOException, SQLException {
//        ServerSocket serverSocket = new ServerSocket(8081);
//        System.out.println("8081서비스 시작");
//
//        String url = "jdbc:mysql://localhost:3306/board1?useSSL=false";
//        String userName = "root";
//        String password = "1234";
//
//        Connection con =  DriverManager.getConnection(url, userName, password);
//        System.out.println("DB 연결 성공");
//
////        statement : 쿼리를 담아 db로 쿼리전달하는 객체
//        Statement st = con.createStatement();
//        String myQuery = "SELECT*FROM Author where" + //id;
//        ResultSet rs =  st.executeQuery(myQuery);
//
//        String name = "";
//        String email = "";
//
//        while (true){
//            while (rs.next()){
//                name = rs.getString("name");
//                email = rs.getString("email");
//            }
////            accept() : 클라이언트의 연결 요청을 수락
//            Socket socket = serverSocket.accept();
//            String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + name;
////            UTF-8문자열 return
//            socket.getOutputStream().write(httpResponse.getBytes(StandardCharsets.UTF_8));
////            플러시란 일반적으로 변경사항을 확정(반영)하는 것을 의미
//            socket.getOutputStream().flush();
//            socket.close();
//        }
    }
}
