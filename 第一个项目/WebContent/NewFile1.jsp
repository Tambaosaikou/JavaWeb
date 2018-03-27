<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
		<legend>注册新用户</legend>
		<form action="#" method="post">
			<table cellpadding="2" align="center">
				<tr>
					<td align="right">用户名：</td>
					<td><input type="text" name="username" /></td>
				</tr>
				<tr>
					<td align="right">密码：</td>
					<td><input type="password" name="password" /></td>
				</tr>
				<tr>
					<td align="right">性别：</td>
					<td><input type="radio" name="gender" value="male" />男 <input
						type="radio" name="gender" value="female" />女</td>
				</tr>
				<tr>
					<td align="right">兴趣：</td>
					<td><input type="checkbox" name="interest" value="film" />看电影
						<input type="checkbox" name="interest" value="code" />敲代码 <input
						type="checkbox" name="interest" value="game" />玩游戏</td>
				</tr>
				<tr>
					<td align="right">头像：</td>
					<td><input type="file" name="photo" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="注册" />
						<input type="reset" value="重填" /></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>