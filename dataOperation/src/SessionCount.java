

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionCount
 */
@WebServlet("/SessionCount")
public class SessionCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionCount() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=Shift_JIS");
	    PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<head>");
	    out.println("<title>セッションテスト</title>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>訪問回数テスト（セッション）</h1>");

	    HttpSession session = request.getSession(false);
	    if(session == null) {
	    	out.println("<p>初回の訪問です。</p>");
	    	session = request.getSession(true);
	    	session.setAttribute("visited", "1");
	    }else {
	    	String visitedStr =(String)session.getAttribute("visited");
	    	int visited = Integer.parseInt(visitedStr);
	    	visited ++;
	    	out.println("<p>" + visited + "回目の訪問です</p>");

	    	session.setAttribute("visited", Integer.toString(visited));
	    }








	    out.println("<a href='/dataOperation/SessionCount'>画面を再訪問</a>");

	    out.println("</body>");
	    out.println("</html>");
	}



	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
			response.setContentType("text/html;charset=UTF-8");
			try(PrintWriter out = response.getWriter()){

			}

		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
