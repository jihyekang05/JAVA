package hello.servlet.basic;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

@WebServlet(name = "responseServlet", urlPatterns = "/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        resp.setStatus(HttpServletResponse.SC_OK);
//        resp.setHeader("Content-Type", "text/plain");
//        resp.setHeader("fakeHeader", "header");
//        resp.setContentType("text/plain");
//        resp.setCharacterEncoding("utf-8");
//        resp.getWriter().write("OK");
//        resp.sendRedirect("/basic/user-form.html");

        // HTML 응답
        //컨텐츠 타입을 html로 지정해 주어야 브라우저에서 html로 랜더링 가능
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("utf-8");
//
//        PrintWriter writer = resp.getWriter();
//        writer.println("<html>");
//        writer.println("<body>");
//        writer.println("<div>Hello, this is response from server</div>");
//        writer.println("</body>");
//        writer.println("</html>");

        // JSON 응답
        ObjectMapper objectMapper = new ObjectMapper();
        resp.setContentType("application/json");
        resp.setContentType("utf-8");

        User user = new User();
        user.setUsername("Bob");
        user.setAge(22);
        user.setPhone("010-0000-0000");

        String result = objectMapper.writeValueAsString(user);

        resp.getWriter().write(result);
    }
}
