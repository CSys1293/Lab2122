<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page session="false" %>
<html>
<head>
	<title>Order Processed</title>
</head>
<body style="font-family: verdana;" background="http://images.fineartamerica.com/images/artworkimages/mediumlarge/1/meadow-flowers-2-claire-bull.jpg">

<h1 style="color:white;">Personal Information</h1>

<p style="color:white;"> Your first name: ${fn} </p>
<p style="color:white;"> Your last name: ${ln}</p>
<p style="color:white;"> Your Age: ${1g }</p>
<p style="color:white;">Your Address: ${ad}</p>
<p style="color:white;">Your email: ${em}</p>
<h2 style="color:white;">You picked the classes listed below</h2>
<ul style="color:white;">
${cl[0] }<br>
${cl[1] }<br>
${cl[2] }<br>
${cl[3] }<br>
${cl[4] }<br>
</ul>
</body>
</html>
