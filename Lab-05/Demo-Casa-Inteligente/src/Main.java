
public class Main {

	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		Controlador controlador = parser.cargarAparatos();
		controlador.get(0).encender();
		System.out.println(controlador);
		String respuesta = "";
		while(respuesta != "salir") {
			System.out.println("Que deseas encender?");
			if (respuesta)
		}
		
	}

}
