<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>logout</title>
</head>
<body>
    <iframe src="http://cas.nefu.edu.cn/cas/logout" style="display: none"></iframe>
    <iframe src="http://cas.nefu.edu.cn/cas/clearCookies.jsp" style="display: none"></iframe>
</body>
<script type="text/javascript">
    window.location.href = "/index.jsp";
</script>
</html>
