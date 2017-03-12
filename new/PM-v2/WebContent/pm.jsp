<!DOCTYPE html>
<%@page import="com.pm.model.Product"%>
<%@page import="java.util.List"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="container">

	<div class="page-header">PM-app</div>

	<c:if test="${allProducts.size() ==0 }">
		<span class="badge">No Products</span>
	</c:if>
	<hr/>
	<c:if test="${allProducts.size() !=0 }">
		
		<div class="panel panel-primary">
		<div class="panel panel-heading">All Products</div>
		<div class="panel panel-body">
			<table class="table table-bordered table-condensed table-stripped">

				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Price</th>
						<th>MakeDate</th>
						<th>Description</th>
						<th></th>
						<th></th>
					</tr>
				</thead>

				<tbody>
					
					<c:forEach items="${allProducts}" var="product">
					<tr>
						<td>${product.id}</td>
						<td>${product.name}</td>
						<td>${product.price}</td>
						<fmt:formatDate value="${product.makeDate}" pattern="dd-MMM-yyyy" var="ds"/>
						<td>${ds}</td>
						<td>${product.description}</td>
						<td>
							<a href="edit-product?id=${product.id}">
							<span class="glyphicon glyphicon-edit"></span></a>
						</td>
						<td>
							<a href="delete-product?id=${product.id}">
							<span class="glyphicon glyphicon-trash"></span></a>
						</td>
					</tr>
					</c:forEach>

				</tbody>

			</table>
		</div>

	</div>
		
		
	</c:if>



	<div class="row">

		<div class="col-xs-6 col-sm-6 col-md-6">

			<div class="panel panel-primary">
				<div class="panel panel-heading">Product Form</div>
				<div class="panel panel-body">
					<form action="save-product" method="post">
						<div class="form-group">
							<label>Name</label> <input name="name" class="form-control">
						</div>
						<div class="form-group">
							<label>Price</label> <input name="price" class="form-control">
						</div>
						<div class="form-group">
							<label>Make-Date ( dd/mm/yyyy )</label> <input name="makeDate"
								class="form-control">
						</div>
						<div class="form-group">
							<label>Description</label>
							<textarea rows="5" cols="35" name="description"
								class="form-control"></textarea>
						</div>
						<button type="submit" class="btn btn-primary">Add</button>
					</form>
				</div>
			</div>

		</div>

	</div>

	<hr />




</body>
</html>