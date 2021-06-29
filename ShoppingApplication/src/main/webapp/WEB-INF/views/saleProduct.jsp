<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Zara Expo</center></h1>
<center>
<form:form action="calculateDiscountedPrice" modelAttribute="saleProductObj" method="post" >
   		<table>
   			<tr>
   			<td> 
   					<label>Product Type</label>
   					</td>
   					<td>
<form:select path="productType" id="productType" items="${productList}"/></td>
</tr>
<tr>
<td>
   		<label>Product Price</label>
   		</td>
    			<td><form:input type="text" path="productPrice" id="productPrice"/> </td>
    					<td><form:errors cssStyle="color:red" path="productPrice" /></td>
    					</tr>
    					<tr><td colspan="2" align="center"> <input type="submit" value="Calculate Discounted Price" name="submit" id="submit" /></td></tr>
    	</form:form>
    	</center>
</body>
</html>	 	  	    	    	     	      	 	


