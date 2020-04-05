package practice;

import java.io.IOException;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Task4
 */
@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task4() {
        super();

    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date today = new Date();
		Random rand = new Random();
		int num = rand.nextInt(6);
		String[] fortuneKinds = {"大吉", "中吉", "小吉", "末吉", "凶", "大凶"};
		FortuneBean fortuneData = new FortuneBean();
		fortuneData.setToday(today);
		fortuneData.setFortune(fortuneKinds[num]);
		request.setAttribute("fortunate", fortuneData);



		request.getRequestDispatcher("/WEB-INF/fortune_result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
