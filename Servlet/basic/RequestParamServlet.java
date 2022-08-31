package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestParamServlet", urlPatterns = "/param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[Parameter Info] - 시작");
        req.getParameterNames().asIterator().forEachRemaining(paramName -> System.out.println(paramName + "="+req.getParameter(paramName)));
        System.out.println("[Parameter Info] - 끝");

        System.out.println("[Parameter specific Info] - start");
        System.out.println(req.getParameter("username"));
        System.out.println(req.getParameter("age"));
        System.out.println(req.getParameter("phone"));
        System.out.println("[Parameter specific Info] - end");

//        System.out.println("[Parameter duplicated names Info] - start");
//        String[] usernames = req.getParameterValues("username");
//        for(String name:usernames) {
//            System.out.println("username" + name);
//        }
//        System.out.println("[Parameter duplicated names Info] - end");
    }
}
