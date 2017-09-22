<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html><head><title>Login Page</title></head><body onload='document.f.username.focus();'>
<h3>로그인이 필요합니다.</h3>
<form name='f' action='/SpringSecurity/login' method='POST'>
<table>
	<tr><td>사용자ID:</td><td><input type='text' name='loginid' value=''></td></tr>
	<tr><td>비밀번호:</td><td><input type='password' name='loginpwd'/></td></tr>
	<tr><td colspan='2'><input name="submit" type="submit" value="Login"/></td></tr>
</table>
</form></body></html>