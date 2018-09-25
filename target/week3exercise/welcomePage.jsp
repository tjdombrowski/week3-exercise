<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="td" uri="http://matc.edu/tags"%>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2><td:Greeting messageType="${greeting.greeting}" /></h2>
    <h2><td:HolidayGreeting messageType="${greeting.additionalGreeting}" /></h2>
</body>
</html>
