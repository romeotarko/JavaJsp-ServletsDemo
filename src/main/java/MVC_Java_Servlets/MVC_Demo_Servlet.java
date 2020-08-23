package MVC_Java_Servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet")
public class MVC_Demo_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           // 1--get data from helper class
        List<Student> students=StudentDataUtil.getStudents();

          // 2--add students to request
        request.setAttribute("student_list",students);

        // 3--get request dispacher
        RequestDispatcher dispatcher=request.getRequestDispatcher("view_students.jsp");

        // 4--now forward to jsp
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
