package jp.co.colla_tech;
//仕様に記載されてはいないが、カリキュラムのほうにはこの設定で組むように書かれているので今回は使わせていただいた。
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HtmlTemplate
 */
@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtmlTemplate() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
//headerメソッド
	public static void header(PrintWriter out){
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'");
		out.println("</head>");
		out.println("<body>");
		}
//footerメソッド
	public static void footer(PrintWriter out) {
		out.println("</body>");
		out.println("</html>");
	}

}
