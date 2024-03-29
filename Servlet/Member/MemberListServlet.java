package hello.servlet;

import domain.member.Member;
import domain.member.MemberRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "memberListServlet", urlPatterns = "/servlet/member-list")
public class MemberListServlet extends HttpServlet {
    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Member> members = memberRepository.findAll();

        PrintWriter w = resp.getWriter();

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");

        for (Member member : members) {
            w.write(member.getId() + "\n");
            w.write(member.getUsername() + "\n");
            w.write(member.getAge() + "\n");
        }
    }
}
