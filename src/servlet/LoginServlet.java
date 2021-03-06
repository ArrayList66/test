package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jdbcTest.test;
import dao.DAO;
import dao.impl.DaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/servlet/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String passward=request.getParameter("passward");
	
		HttpSession se=request.getSession();
		DAO dao =new DaoImpl();
		try{
			List<test> list= dao.query();
			se.setAttribute("test",list);
			}catch(Exception e){
				
				e.printStackTrace();
				 request.getRequestDispatcher("/error.jsp").forward(request, response);
			}
		 request.getRequestDispatcher("/main.jsp").forward(request, response);
		
		
	}

}
