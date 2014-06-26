
<!DOCTYPE html>
<html>
<head>
<title>GN Clinic</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link href="resources/css/bootstrap.min.css" rel="stylesheet"
	media="screen">
<link href="resources/css/bootstrap-responsive.min.css" rel="stylesheet"
	media="screen">
<link href="resources/css/main.css" rel="stylesheet">
<style type="text/css">
body {
	padding-top: 60px;
}

#footer {
	background-color: #f5f5f5;
	height: 60px;
}

.main-hero {
	margin: 30px;
}
</style>
</head>
<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="navbar-inner">
			<div class="container-fluid">
				<a class="brand" href="#">GN Clinic</a> <a class="btn btn-navbar"
					data-toggle="collapse" data-target=".nav-collapse"> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
				</a>

				<div class="nav-collapse in collapse" style="height: auto;">
					<ul class="nav">
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#"> Menu Principal <b
								class="caret"></b>
						</a>
							<ul class="dropdown-menu dropdown-menu-inverse">
								<li><a class="opcionMenu" href="usuarios">Gestion de
										Usuarios</a></li>
							</ul></li>
					</ul>
					<ul class="nav pull-right">
						<li class=""><a href="#"><!-- ${usuarioLogin.nombre}
								${usuarioLogin.apellidos} -->Usuario Login</a></li>
						<li class=""><a class=">" href="salir">Salir</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="container-fluid">
		<div class="row-fluid">

			<div class="span2">
				<div class="well sidebar-nav">
					<ul class="nav nav-list">
						<li class="nav-header">ToolBar 1</li>
						<li class="active"><a class="opcionMenu" href="usuarios"><i
								class="icon-user"></i> Usuarios</a></li>
						<li><a href="">opcion 2</a></li>
						<li class="nav-header">ToolBar 2</li>
						<li><a href="">opcion 3</a></li>
						<li><a href="">opcion 4</a></li>
						<li class="divider"></li>
						<li><a href="">Salir</a></li>
					</ul>
				</div>
			</div>
			<div class="span10">
				<div class="row-fluid">

					<div class="tabbable span12">

						<ul class="nav nav-tabs">
							<li class="active"><a href="#tab1" data-toggle="tab">Ver
									Registros</a></li>
							<li><a href="#tab2" data-toggle="tab"><i
									class="icon-user"></i> Perfiles</a></li>
							<li class="disabled"><a href="#">Mensajes</a></li>

							<li class="pull-right">
								<div class="btn-group">
									<button type="button" title="Nuevo Registro"
										class="btn btn-success">
										<i class="icon-file icon-white"></i>
									</button>
									<button type="button" title="Editar Registro"
										class="btn btn-success">
										<i class="icon-pencil icon-white"></i>
									</button>
									<button type="button" title="Cambiar Estatus"
										class="btn btn-success">
										<i class="icon-repeat icon-white"></i>
									</button>
									<button type="button" title="Cambiar Estatus"
										class="btn btn-success">
										<i class="icon-repeat icon-white"></i>
									</button>
									<button type="button" title="Cambiar Estatus"
										class="btn btn-success">
										<i class="icon-repeat icon-white"></i>
									</button>
									<button type="button" title="Cambiar Estatus"
										class="btn btn-success">
										<i class="icon-repeat icon-white"></i>
									</button>
									<button type="button" title="Cambiar Estatus"
										class="btn btn-success">
										<i class="icon-repeat icon-white"></i>
									</button> 
									<button type="button" title="Eliminar Registro"
										class="btn btn-danger">
										<i class="icon-trash icon-white"></i>
									</button>
								</div>
							</li>

						</ul>

						<div class="tab-content">
							<div class="tab-pane active " id="tab1">




								<div id="content">


									<p>Estoy en 1</p>
								</div>

							</div>
							<div class="tab-pane" id="tab2">
								<p>Estoy en 2</p>
							</div>
						</div>
					</div>
				</div>
			</div>



		</div>

	</div>

	<div class="main-hero hero-unit">

		<h1>Texto de Ejemplo</h1>

		<p>Texto principal de bienvenida a nuestra página. Prueba a
			redimiensinar el navegador y comprobará como se adapta el diseño al
			nuevo tamaño.</p>

		<p>
			<a class="btn btn-primary btn-large">Más información</a>
		</p>

	</div>

	<div id="footer">
		<div class="container">
			<p class="muted credit">
				Example courtesy <a href="http://martinbean.co.uk">Martin Bean</a>
				and <a href="http://ryanfait.com/sticky-footer/">Ryan Fait</a>.
			</p>
		</div>
	</div>

	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/app.js"></script>
</body>
</html>



