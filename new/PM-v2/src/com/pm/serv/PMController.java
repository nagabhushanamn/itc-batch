package com.pm.serv;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pm.dao.HibProductDAOImpl;
import com.pm.dao.ProductDAO;
import com.pm.model.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet(urlPatterns = { "/pm", "/save-product", "/delete-product", "/edit-product", "/update-product" })
public class PMController extends HttpServlet {

	ProductDAO productDAO = null;

	@Override
	public void init() throws ServletException {
		productDAO = new HibProductDAOImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String reqPath = req.getRequestURI();

		if ("/PM/pm".equals(reqPath)) {

			List<Product> products = productDAO.findAll();

			req.setAttribute("allProducts", products);

			RequestDispatcher rd = req.getRequestDispatcher("pm.jsp");
			rd.forward(req, resp);

		}

		if ("/PM/delete-product".equals(reqPath)) {
			String id = req.getParameter("id");
			productDAO.delete(Integer.parseInt(id));
			resp.sendRedirect("pm");
		}

		if ("/PM/edit-product".equals(reqPath)) {
			String id = req.getParameter("id");

			Product product = productDAO.find(Integer.parseInt(id));

			req.setAttribute("product", product);

			RequestDispatcher rd = req.getRequestDispatcher("edit-product.jsp");
			rd.forward(req, resp);

		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String price = req.getParameter("price");
		String makeDate = req.getParameter("makeDate");
		String description = req.getParameter("description");

		Product product = new Product();
		product.setName(name);
		product.setPrice(Double.parseDouble(price));

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			product.setMakeDate(dateFormat.parse(makeDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		product.setDescription(description);

		if (id == null) {
			productDAO.save(product);
		} else {
			product.setId(Integer.parseInt(id));
			productDAO.update(product);
		}

		// List<Product> products = productDAO.findAll();
		//
		// req.setAttribute("allProducts", products);
		//
		// RequestDispatcher rd = req.getRequestDispatcher("pm.jsp");
		// rd.forward(req, resp);

		resp.sendRedirect("pm");

	}

}
