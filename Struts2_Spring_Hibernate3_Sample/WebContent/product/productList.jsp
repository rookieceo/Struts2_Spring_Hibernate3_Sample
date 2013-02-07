<%-- 
    Document   : productList
    Created on : 2009. 9. 11, 오후 2:00:39
    Author     : 장인기
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List</title>
    </head>
    <body>
        <s:iterator value="productList">
            <s:property value="pid"/> :
            <s:property value="name"/>  :
            <s:property value="description"/>  : <br/>
        </s:iterator>
    </body>
</html>
