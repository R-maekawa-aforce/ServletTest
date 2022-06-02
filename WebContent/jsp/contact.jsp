<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="../header.html"%>
<link href="../design.css" media="all" rel="stylesheet">

<form action="../servlet/model" method="post">

	<p>
		氏名：<input type="text" name="name" required="required">
	</p>
	<p>
		会社名：<input type="text" name="company">
	</p>
	<p>
		メールアドレス：<input type="text" name="mail" required="required">
	</p>
	<p>
		お問い合わせ内容：
		<textarea name="contact" rows="4" cols="40" required="required"></textarea>
	</p>

	<p>
		メルマガ種類： <input type="checkbox" name="info" value="総合案内">総合案内 <input
			type="checkbox" name="info" value="セミナー案内">セミナー案内 <input
			type="checkbox" name="info" value="求人採用情報">求人採用情報
	</p>

	<p>
		資料請求希望 <input type="radio" name="yesNo" value="yes">Yes <input
			type="radio" name="yesNo" value="no">No <input type="submit"
			value="送信">
</form>

<%@include file="../footer.html"%>