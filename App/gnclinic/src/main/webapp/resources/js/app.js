$(function() {

	$("forma").on("submit", function(e) {		
		e.preventDefault();
		var data = $(this).serialize();
		$.getJSON("login?" + data);		
	});
	
	$("a.opcionMenu").click(function(e){		
		e.preventDefault();
		$.getJSON("menu?opcion="+ $(this).attr("href"), function(data){
			console.log(data);			
			generarTabla(data);
		});		
	});	
	
	$("a.opcionMenuDisabled").click(function(e){		
		e.preventDefault();
	});
	
	
	generarTabla = function(data){
		
		var table = "<table class='table table-hover table-bordered'>";	
		var theader = "<thead><tr class='well well-small'>";		
		
		theader += "<th style='text-align:center; vertical-align:top;' ><input type='checkbox'></th>";
		theader += "<th style='text-align:center;'>Usuario</th>";
		theader += "<th style='text-align:center;'>Password</th>";
		theader += "<th style='text-align:center;'>Estatus	</th>";
		
		
		theader += "</tr></thead>";
		
		var tbody = "<tbody>";					
		
		$.each(data, function(index, value){						
			
			var fila = "<tr id='" + value["idUsuario"] + "'>";
			
			$.each(value, function (i, v){
				var c;
				
				if(i == "idUsuario")					
					c = "<input type='checkbox'/>";
				else if(i == "estatus"){
					c = "<span class='estatus_" + v + "'></span>"
				}				
				else{
					c = v;
				}					 
				
				fila += "<td style='text-align:center; vertical-align:top;'>" + c + "</td>";
				
			});
			
			fila += "</tr>";
			tbody += fila;
			
		});		
		 
		tbody += "</tbody>";
		table += theader + tbody + "</table";
		
		$("#content").html(table);
		installEventos();
	};	
	
	installEventos = function(){		
		
		$("a.accion").off("click").on("click", function(e){
			
			e.preventDefault();
			var btn = $(this);
			var accion;
			
			if(btn.hasClass("delete")){
				 accion = "delete";
			}
			else if(btn.hasClass("estatus")){
				accion = "estatus";
			}
			
			$.getJSON("module?accion=" + accion + "&id=" + $(this).parents("tr").attr("id"), function(data){
				
				if(accion == "estatus" && data == 1){
					
					var txt = btn.text();
					if(txt == " Habilitar")
						btn.html("<i class='icon-remove icon-white'></i> Bloquear")
					else  btn.html("<i class='icon-ok icon-white'></i> Habilitar")
				}
				
			});
			
		});
		
	}

});
