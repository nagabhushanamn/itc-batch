package com.myfacebook.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.myfacebook.dao.PostDAOImpl;
import com.myfacebook.model.Post;

/**
 * Servlet implementation class PostController
 */
@WebServlet(urlPatterns = { "/save-post", "/load-all-posts" })
public class PostController extends HttpServlet {

	PostDAOImpl postDAO = new PostDAOImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {

		List<Post> posts = postDAO.findAll();

		final StringWriter sw = new StringWriter();
		final ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(sw, posts);

		response.setContentType("application/json");

		PrintWriter out = response.getWriter();
		out.println(sw.toString());
		out.close();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String message = request.getParameter("message");

		Post post = new Post();
		post.setEmail(email);
		post.setMessage(message);

		postDAO.save(post);

		response.setContentType("application/json");

		final StringWriter sw = new StringWriter();
		final ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(sw, "success");

		PrintWriter out = response.getWriter();
		out.println(sw.toString());
		out.close();

	}

}
