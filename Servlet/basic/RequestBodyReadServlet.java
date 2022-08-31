package hello.servlet.basic;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.StreamUtils;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

//메시지 body를 읽는 메서드
@WebServlet(name="requestBodyStringServlet" , urlPatterns = "/request-body")
public class RequestBodyReadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //text타입 읽기
        readAndPrintText(req);
        readAndPrintJson(req);
    }

    private void readAndPrintText (HttpServletRequest req) throws IOException{
        ServletInputStream inputStream = req.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream,
                StandardCharsets.UTF_8);

        System.out.println("messageBody = " + messageBody);
    }
    private void readAndPrintJson(HttpServletRequest req) throws IOException{
       // {"username" : "anne","age": 30,"phone":"010-0000"}
        ObjectMapper objectMapper = new ObjectMapper();
        ServletInputStream inputStream = req.getInputStream();
        String messageBody = StreamUtils.copyToString(inputStream,
                StandardCharsets.UTF_8);
        User user = objectMapper.readValue(messageBody, User.class);
        System.out.println("user = " +user.getUsername());
        System.out.println("age = " +user.getAge());
        System.out.println("phone = " +user.getPhone());
    };


}
