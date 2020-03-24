<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.Date, java.text.SimpleDateFormat"  %>
    <%! Date now = new Date();
    SimpleDateFormat f =new SimpleDateFormat("yyyy年MM月dd日");
    String s = f.format(now);

    %>
    <% //調べてみて作ったもの,そのままコピーしてできたもの%>
    <%
    String strCnt = (String) (application.getAttribute("cnt"));
    if(strCnt==null){
    strCnt="1";
    }else{
    strCnt=Integer.toString(Integer.parseInt(strCnt)+1);
    }
    application.setAttribute("cnt",strCnt);
    %>
    <%//static,静的フィールドを使う場合 %>
    <%!
    static int count;
    %>
    <%
    count = count + 1;
    %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>



</head>
<body>




<h1>本日の訪問回数:<%= strCnt %></h1>
<h1>本日の訪問回数:<%= count %></h1>
<p>今日の日付: <%= s %></p>


</body>
</html>