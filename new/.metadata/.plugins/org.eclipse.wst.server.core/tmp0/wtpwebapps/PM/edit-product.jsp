<!DOCTYPE html>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.pm.model.Product"%>
<%@page import="java.util.List"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body class="container">

	<div class="page-header">PM-app</div>

	<%
	Product product=(Product)request.getAttribute("product");
	%>
	
	<div class="row">

		<div class="col-xs-6 col-sm-6 col-md-6">

			<div class="panel panel-primary">
				<div class="panel panel-heading">Edit Product Form</div>
				<div class="panel panel-body">
					<form action="update-product" method="post">
						<div class="form-group">
							<label>Id</label> <input name="id" value="<%=product.getId() %>" class="form-control" readonly="readonly">
						</div>
						<div class="form-group">
							<label>Name</label> <input name="name" value="<%=product.getName() %>" class="form-control">
						</div>
						<div class="form-group">
							<label>Price</label> <input name="price"  value="<%=product.getPrice() %>" class="form-control">
						</div>
						<div class="form-group">
							<%
							DateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
							String ds=dateFormat.format(product.getMakeDate());
							%>
							<label>Make-Date</label> <input name="makeDate" value="<%=ds %>"class="form-control">
						</div>
						<div class="form-group">
							<label>Description</label>
							<textarea rows="5" cols="35" name="description" class="form-control"><%=product.getDescription() %></textarea>
						</div>
						<button type="submit" class="btn btn-primary">Update</button>
					</form>
				</div>
			</div>

		</div>

	</div>

	<hr />




</body>
</html>