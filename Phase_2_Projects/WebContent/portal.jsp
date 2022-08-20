<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<b>PROVIDED PRODUCT DETAILS :</b><br><br>
Product Id: <%=session.getAttribute("product_id")%><br><br>

   Product Name: <%= session.getAttribute("product_name")%><br><br>

   Price of Product: <%= session.getAttribute("price")%><br><br>

  Quantity: <%= session.getAttribute("quantity")%><br><br>
</center>	

</body>
</html>