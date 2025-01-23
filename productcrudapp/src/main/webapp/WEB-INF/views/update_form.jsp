<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@include file="./base.jsp"%>
</head>
<body>

	<div class="bg-image"></div>

	<div class="bg-text">
		<div class="container mt-3">

			<div class="row">

				<div class="col-md-6 offset-md-3">

					<h1 class="text-center mb-3">Change Product Details</h1>

					<form action="${pageContext.request.contextPath}/handle-product"
						method="post">

						<input type="hidden" value="${product.id }" name="id" />

						<div class="form-group">
							<label for="name">Product Name</label> <input type="text"
								class="form-control" id="name" aria-describedby="emailHelp"
								name="name" placeholder="Enter the product name here"
								value="${product.name }">
						</div>

						<div class="form-group">
							<label for="description">Product Description</label>
							<textarea class="form-control" id="description"
								name="description" rows="5"
								placeholder="Enter the product description">${product.description }</textarea>
						</div>

						<div class="form-group">
							<label for="price">Product Price</label> <input type="text"
								class="form-control" id="price" name="price"
								placeholder="Enter product price" value="${product.price }">
						</div>

						<div class="container text-center">
							<!-- This href give the name of the project in the expression tag -->
							<a href="${pageContext.request.contextPath }/"
								class="btn btn-outline-danger">Back</a>
							<button type="submit" class="btn btn-info">Update</button>
						</div>

					</form>

				</div>

			</div>

		</div>
	</div>

</body>
</html>