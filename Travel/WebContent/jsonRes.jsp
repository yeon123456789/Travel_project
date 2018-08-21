<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
[<c:forEach items="${requestScope.datas}" var="data">
	{"name":"${data.name}", "lat":${data.lat}, "lon":${data.lon}},
</c:forEach>]