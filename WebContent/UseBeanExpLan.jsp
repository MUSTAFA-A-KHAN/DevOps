<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="ob" class="bean.BeanClass"></jsp:useBean>
    <jsp:setProperty property="*" name="ob"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <br> Rollno. ${ob.roll}
   <br> Name.   ${ob.name}
   <br> Address ${ob.address }
   

</body>
</html>