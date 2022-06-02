package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Info;

@WebServlet("/servlet/model")
public class Model extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");


		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String mail = request.getParameter("mail");
		String contact = request.getParameter("contact");
		String[] info = request.getParameterValues("info");
		String yesNo = request.getParameter("yesNo");

		Info i = new Info();
		i.setName(name);
		i.setCompany(company);
		i.setMail(mail);
		i.setContact(contact);
		i.setMail(mail);
		i.setInfo(info);
		i.setYesNo(yesNo);

		request.setAttribute("information", i);

		if (yesNo.equals("yes")){
			request.getRequestDispatcher("../jsp/response.jsp").forward(request, response);

		}else {
			request.getRequestDispatcher("../jsp/response2.jsp").forward(request, response);

		}

	}

}
