<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head> </head> 
<script type="text/javascript">
function myfunction() { 
var first = document.getElementById("textbox1").value;
 var second = document.getElementById("textbox2").value; 
var answer =parseFloat(first)+parseFloat(second);

var textbox3 = document.getElementById('textbox3');
textbox3.value=answer;
 } 
</script>
 <body> 
<input type="text" name="textbox1" id="textbox1" /> + <input type="text" name="textbox2" id="textbox2" /> 
<input type="submit" name="button" id="button1" onclick="myfunction()" value="=" />
<br/>
Your answer is:--
<input type="text" name="textbox3" id="textbox3" readonly="true"/>
</body>
 </html>