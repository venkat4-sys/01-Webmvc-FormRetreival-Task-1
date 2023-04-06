<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <h3> Book Details </h3>
<form action="abc">

 BookId:<input type="text" name="id"/>
        <input type="submit" value="Search"/>

<hr>
 Book Id:${book.product_id }<br>
 Book Name:${book.productname }<br>
 Book Price:${book.product_cost }



</form>
   

</body>
</html>