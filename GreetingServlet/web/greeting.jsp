
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Greeting Page</title>

    <!-- refresh 5 saat -->
    <meta http-equiv="refresh" content="5">
</head>
<body>

    <h1>
        Hello, <%= request.getAttribute("name") %>!
    </h1>

    <p>
        Current Date & Time: <%= new Date() %>
    </p>

</body>
</html>
