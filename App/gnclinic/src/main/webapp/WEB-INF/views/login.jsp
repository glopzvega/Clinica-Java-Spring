<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>GNCLINIC</title>

<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/app.js"></script>

<link href="resources/css/bootstrap.min.css" rel="stylesheet" media="screen">
<link href="resources/css/login.css" rel="stylesheet">

</head>
<body>

	<h3>${mensaje}</h3>	
	<div class="container">	
		<form class="form-signin" action="login" method="post">
			<legend>Acceder</legend>
			<input name="username" type="text" class="input-block-level" placeholder="Username">
			<input name="password" type="password" class="input-block-level" placeholder="Password"> 
			<label class="checkbox"> 
				<input name="recordar" type="checkbox" value="1"> Recordarme
			</label>
			<button 
				class="btn btn-large btn-primary" type="submit">Login</button>
		</form>
	</div>

</body>