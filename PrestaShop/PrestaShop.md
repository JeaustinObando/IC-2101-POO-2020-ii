Jeaustin Obando Arias
2020067573
Tecnologico de Costa Rica 
Programacion Orientada a Objetos
17/09/2020


Muy especificamente el software "PrestaShop" es una aplicacion
destinada a la creacion de una tienda virtual, personalizar tu tienda
puedes elegir tus colores, un logo y varios diseños que se le ofrecen,
ofrece gestion del negocio: añadir productos, controlar tus pedidos, desarrollo 
de una relacion entre el cliente y el negocio, atraer visitantes: crear contenido 
para viralizar por tus redes sociales y el poder hacer tu tienda internacional 
permitiendo que se haga en varios idiomas y diferentes tipos de monedas.

https://www.youtube.com/watch?v=4wuKOyqVJ-w
//Link para ver un minitutorial de la pagina

A- PrestaShop
B- https://www.prestashop.com
C- Es un software creado para gestionar una tienda virtual(Idioma principal Frances).
D- Software de Aplicacion
E- Software Libre
F- Actores:

	Usuarios:
		Directos: Persona la cual crea su propia tienda desde el software
		Secundarios: Persona la cual compra en la tienda virtual 
	
	Clientes y Patrocinadores: Linea Grafica, YATEO, ITIS Commerce, Axome, eComm360
	
	Equipo de Ingenieria: Igor Schlumberger y Bruno Leveque

	Autoridades: Thomas N, Remi Gaillard, GoT

Requerimientos Funcionales:

	Registrarse en el sistema 
		Entradas: -Seleccionar un perfil
			  -Seleccionar el aprox en que se abre la tienda
			  -Correoelectronico
		Salida: -"Muchas Gracias por registrarse"
			-Archivo de Descarga del Software

		Comportamiento: -Se toman los datos registrados para agregar
				 a un nuevo usuario al sistema

	Registrar una tienda virtual
		Entradas: -Seleccionar que tipo de tienda es
			  -En que pais se ubica
			  -Subir alguna imagen o video para representacion
			  -Dar una pequeña descripcion de los productos que se piensan vender
		
		Salida: -"Su tienda a sido registrada con exito"
			-Vista previa de la tienda

		Comportamiento: -Se registra una nueva tienda la cual quedara guardada y en unos
				dias lista para mostrar a los usuarios segundarios

	Financiar una tienda virtual:
		Entradas: -Usuario
			  -Contraseña
			  -Tarjeta de credito
			  -Datos financieros

		Salida: -"Usted ha patrocinado una tienda"
			-Mensaje de financiamiento exito
		
		Comportamiento: -Se da la opcion de que quien quiera financiar alguna de las miles 
				de tiendas que se encuentran en la tienda

	Comerciar preductos:
		Entrada: -Ingresar a su cuenta
			 -Buscar un producto
			 -Elegirlo
			 -Pagar por el producto
			 -Confirmar
		
		Salidas: -Mensaje de Exito
			 -Compra relizada
			 
		Comportamiento: Obtencion de un producto al buscarlo y elegirlo, a gusto de cada persona

Requerimientos No Funcionales:
	
	Este software es compatible con gran variedad de sistemas operativos como lo son Mac, Windows y Linux
	Se puede utilizar tanto en computadoras como en telefonos celulares
	
	En cuanto al pago de su software como su sede es centralizada en Paris su moneda seria el Euro pero como se 
	recorre por todo el mundo existe la posiblidad de pagarlo tambien en dolares
					
					
Caso de Usos 

	Comprar Articulo:
		Actor Primario: -Usuario
		
		Actor Segundario: -Dueño (De la tienda virtual)
		
		Pre-Condiciones: -El usuario debe estar registrado para visualizar los productos.
		
		Post-Condiciones: -El usuario compra el producto
		
		Flujo Principal: 1- El usuario ingresa a la tienda virtual deseada.
				2- Seleccionar el articulo deseado.
				3- Presionar en comprar
				4- Ingresar un metodo de pago
				5- El sistema muestra "Compra Exitosa"
		
		Flujo Alterno: 2-(b) El sistema indica que no se encuentran articulos disponibles
				3- (b) Se muestra mensaje "No hay articulos disponibles"
	
		
	
	Crear Tienda
		Actor Primario: -Usuario
		
		Actor Segundario: -Algoritmo del programa
		
		Pre-Condiciones: El usuario debe de estar registrado y auntenticado en el sistema
		
		Post-Condiciones: El usuario puede mostrar su tienda en linea.
		
		Flujo Principal: 1- Se selecciona la opcion de "crear una tienda"
				2- Se introduce el nombre, el lugar de residencia y cedula
				3- Se selecciona la categoria de Tienda
				4- Introduce el nombre de la tienda.
				5- Se selecciona crear tienda
		
		Flujo Alternos: 2- (b) El sistema indica que ya hay registrado el nombre de la tienda en el sistema
				3- (b) El sistema indica que no se lograron verificar los datos personales 
				
	
	
	Cambiar Diseño de la Pagina:
		Actor Primario: -Usuario
		
		Actor Segundario: -Algoritmo del Programa
		
		Pre-Condiciones: Tener previamente una Tienda Virtual creada.
		
		Post-Condiciones: El diseño de la pagina ha cambiado.
		
		Flujo Principal: 1- Selecciona el apartado de "Configuraciones"
				2- Selecciona "Diseños de Tienda"
				3- Se selecciona el diseño preferido
				4- Se selecciona "confirmar"
				5- Se muestra mensaje de "Cambio con exito"
				
		Flujo Alterno: 2- (b) Se muestra un mensaje que ocurrio un error mientras se procedia en el cambio
				3- Se muestra "Error no se logro cambiar el diseño" 
				
	Cambiar Idioma:
				
		Actor Primario: -Usuario
		
		Actor Segundario: -Algoritmo del Programa
		
		Pre-Condiciones: -Tener previamente una Tienda Virtual Creada.
		
		Post-Condiciones: -Cambio de Idioma al de la preferencia del Usuario
		
		Flujo Principal: 1- Se selecciona configuracion
				2- Se selecciona en el apartado de "Internacional"
				3- Se selecciona "Translations"
				4- Se elige de entre las muchas opciones que se encuentran
				5- Se selecciona "Añadir y actualizar"
				
		Flujo Alterno: 2-(b) El sistema muestra un mensaje de Idioma no disponible en este momento
				3- Mensaje "Este idioma no se encuentra disponible"
	
	Activar Modulo:
		
		Actor Primario: -Usuario
		
		Actor Segundario: -Algoritmo del Programa 
		
		Pre-Condiciones: -Tener previamente una Tienda Virtual Creada
		
		Post-Condiciones: -Modificacion de los modulos a gusto propio 
		
		Flujo principal: 1-Se selecciona la configuracion
				2-Se selecciona el apartado de modulos
				3-Se edita la posicion de los modulos 
				4-Se confirman las modificaciones
				
		Flujo Alterno: 2-(b) Los modulos modificados no aceptan los cambios
				3- Muestra un mensaje de error
		
	
	Envio de Producto
		
		Actor Primario: -Usuarios
		
		Actor Segundario: -Algoritmo del Programa
		
		Pre-Condiciones: -Haber seleccionado un articulo para su compra
		
		Post-Condiciones: -Se envia el producto
		
		Flujo principal: 1- Se selecciona en que quiere que sea el envio
				2-Se confirma la opcion elegida
				3-Muchas gracias por su compra
		
		Flujo Alternativo: 2- (b) El envio no esta disponible en este momento 
				   3-Se muestra un error en pantalla 
		
