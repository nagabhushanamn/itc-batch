package com.app.serv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.model.Mobile;
import com.app.model.Person;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/person")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//

		Person person = new Person();
		person.setName("Nag");
		person.setAge(32);

		Mobile mobile1 = new Mobile();
		mobile1.setName("Samsung A7");

		Mobile mobile2 = new Mobile();
		mobile2.setName("iphone 6s");

		// person.setMobile(mobile);

		List<Mobile> mobiles = new ArrayList<>();
		mobiles.add(mobile1);
		mobiles.add(mobile2);

		person.setMobiles(mobiles);

		request.setAttribute("person", person);

		request.getRequestDispatcher("person-det.jsp").forward(request, response);

	}

}
