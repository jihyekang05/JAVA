package hello.servlet.basic;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "requestInfoServlet", urlPatterns = "/request")
public class requestInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        printRequestInfo(req);
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");
        resp.getWriter().write("-------------Request Information----------\n");
        resp.getWriter().write("req.getMethod()=" + req.getMethod() + "\n");
        resp.getWriter().write("req.getProtocol() = " + req.getProtocol() + "\n");
        resp.getWriter().write("req.getScheme() = " + req.getScheme() + "\n");
        resp.getWriter().write("req.getRequestURL() = " + req.getRequestURL() + "\n");
        resp.getWriter().write("req.getQueryString() = " + req.getQueryString() + "\n");
        resp.getWriter().write("req.isSecure() = " + req.isSecure()+ "\n");

        // HTTP 헤더 정보 출력
        System.out.println("헤더 정보 출력");
        req.getHeaderNames().asIterator().forEachRemaining(headerName -> System.out.println("headerName : " +
                req.getHeader(headerName)));
        // 기타 정보
        System.out.println("기타 정보");
        System.out.println("req.getRemoteHost() = " + req.getRemoteHost());
        System.out.println("req.getRemoteAddr() = " + req.getRemoteAddr());
        System.out.println("req.getRemotePort() = " + req.getRemotePort());

    }
    
    private  void printRequestInfo(HttpServletRequest req) {
        System.out.println("-------------Request Information----------");
        System.out.println("req.getMethod() = " + req.getMethod());
    }

}
