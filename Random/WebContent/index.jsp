<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>

<p>Click the button to display a random number.</p>

<button onclick="myFunction()">generate integer</button>
<button onclick="myFunction1()">generate character</button>
<button onclick="myFunction2()">generate integer  character</button>

<form method="post" action="Rand_num">
<input type="text" name="textbox3" id="demo" readonly="true"/>
<input type="submit">
</form>
<script>


 function myFunction() {
	
	  var text = "";
	  var possible = "0123456789";

	  for (var i = 0; i < 7; i++)
	    text += possible.charAt(Math.floor(Math.random() * possible.length));	  	  	  
	  demo.value= text;
	  	}
	
 function myFunction1() {
	  var text = "";
	  var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	  for (var i = 0; i < 7; i++)
	    text += possible.charAt(Math.floor(Math.random() * possible.length));
	  demo.value = text;
	}
function myFunction2() {
	  var text = "";
	  var possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0213456789";

	  for (var i = 0; i < 7; i++)
	    text += possible.charAt(Math.floor(Math.random() * possible.length));
        demo.value = text;	 
	} 



</script>

</body>
</html>
