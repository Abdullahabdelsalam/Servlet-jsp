package registratian.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import registratian.dao.VisitorDao;
import registratian.model.Visitor;

import java.io.IOException;

/**
 * Servlet implementation class VisitorServlet
 */
@WebServlet("/register")
public class VisitorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   private VisitorDao visitorDao ;

	    public void init() {
	        visitorDao = new VisitorDao();
	    }
   
    public VisitorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/visitorregister.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String firstName = request.getParameter("first-name");
        String lastName = request.getParameter("last-name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("phone-number");
        String address = request.getParameter("address");
        String age = request.getParameter("age");

        Visitor visitor = new Visitor();
        visitor.setFirstName(firstName);
        visitor.setLastName(lastName);
        visitor.setEmail(email);
        visitor.setPassword(password);
        visitor.setPhoneNumber(phoneNumber);
        visitor.setAddress(address);
        visitor.setAge(age);
        
        try {
            visitorDao.registerVisitor(visitor);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/visitordetails.jsp");
		dispatcher.forward(request, response);
    }
        
	

}
