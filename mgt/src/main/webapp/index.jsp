<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="com.neusoft.education.tp.sso.client.filter.CASFilterRequestWrapper" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<script>top.location.href = "${ctx}/single/login";</script>