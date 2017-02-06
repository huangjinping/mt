<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<%
	String ctx = request.getContextPath();
	request.setAttribute("path", ctx);
%>
    
<script type="text/javascript" src="${path}/js/jquery-1.9.1/jquery.js"></script>
