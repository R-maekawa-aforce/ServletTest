<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="../design.css" media="all" rel="stylesheet">
<section>
<p>氏名：${information.name}</p>
<p>会社名：${information.company}</p>
<p>メールアドレス：${information.mail}</p>
<p>お問い合わせ内容：${information.contact}</p>

<p>
	メルマガ種類：
	<c:forEach var="p" items="${information.info}">
${p}、
</c:forEach>
</p>

<p>資料請求：${information.yesNo}</p>



<p>この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。</p>

<p><a href="https://www.a-force.biz/">リンク</a></p>
</section>

<%@include file="../footer.html"%>