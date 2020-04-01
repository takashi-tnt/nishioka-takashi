

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Result
 */
@WebServlet("/Result")
public class Result extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Result() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name =request.getParameter("txt") ;
		String checkboxSex = request.getParameter("sex");
		String contactBox = request.getParameter("contact");
		String contactReview = request.getParameter("contactReview");
		response.setContentType("text/html; charset = UTF-8");
		response.getWriter().append("<p>以下の内容でお問い合わせいたしました。回答をお待ちください。</p>");
		response.getWriter().append("<p>名前" + name + "</p>");
		response.getWriter().append("<p>性別" + checkboxSex + "</p>");
		response.getWriter().append("<p>お問い合わせ種類:" + contactBox + "</p>");
		response.getWriter().append("<p>お問い合わせ内容:" + contactReview + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
