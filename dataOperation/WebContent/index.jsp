<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	</head>
	<body>
		<form action="/dataOperation/Result" method = "POST">
			<p>名前:<input type = "text" name = "name"></p>
			<p>性別:　男<input type = "radio" name = "sex" value ="男性">　女<input type = "radio" name = "sex" value ="女性"></p>
			<p>お問い合わせ種類</p>
			<p><select name = "contact">
			<option value = "product">製品について</option>
			<option value = "clame">不具合やクレーム</option>
			<option value = "support">アフターサポート</option>
			</select></p>
			<p>お問い合わせ内容</p>
			<p><textarea name = "contactReview" rows="4" >150文字以内で入力してください</textarea></p>
			<p><input type="submit" value = "送信"></p>
		</form>
	</body>
</html>