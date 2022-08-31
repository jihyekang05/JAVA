package hello.servlet.web.servlet;

import domain.member.Member;
import domain.member.MemberRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "memberSaveServlet", urlPatterns = "/servlet/save")
public class MemberSaveServlet extends HttpServlet {

    MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // POST를 통해 메시지가 들어옴
        // memberRepository에 저장하는 방법?

        //메시지 저장
//        req.getParameter("username");
//        req.getParameter("age");
        Member member = new Member(
                req.getParameter("username"),
        Integer.parseInt(req.getParameter("age")));
        memberRepository.save(member);

        resp.getWriter().write(
                "id : " + member.getId() + "\n"
                + "username : " + member.getUsername() + "\n"
                + "age : " + member.getAge() + "\n"
        );






    }
}
