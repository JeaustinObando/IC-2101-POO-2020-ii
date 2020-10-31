
public class Main {
	public static void main (String[]args) {
		String seudonimo, descripcion, hashtags;
		Float latitud, longitud;
		Double tarifa;
        Servicio x;
        Servicio y;
        Servicio z;
        
        seudonimo = "Limpieza de Alfombras";
        descripcion = "Nos trasladamos hasta su hogar\n" + 
                "para realizar una limpieza\n" + 
                "profunda de sus alfombras,\n" + 
                "nuestros productos le aseguran\n" + 
                "desinfección total del 99% de\n" + 
                "virus y bacterias. (única empresa\n" + 
                "con garantía anti covid19).";
        hashtags = "#limpieza #muebles #casa #covid19";
        tarifa = (double) 15000;
        latitud = (float) 10.068230;
        longitud = (float) -84.312330;
        
        x = new Servicio (seudonimo, tarifa, descripcion, hashtags, latitud, longitud);

        seudonimo = "Jardinería";
        descripcion = "Ofrecemos servicios de jardinería\n" + 
                "en la provincia de Alajuela.\n" + 
                "Contamos con todo el equipo\n" + 
                "necesario, cuidamos de sus\n" + 
                "plantas y les damos lo que necesiten";
        hashtags = "#plantas #jardinería #casa";
        tarifa = (double) 8000;
        latitud = (float) 16.974260;
        longitud = (float) -96.726830;
        
        y = new Servicio (seudonimo, tarifa, descripcion, hashtags, latitud, longitud);
        
        seudonimo = "Venta de Pan";
        descripcion = "Ofrecemos Pan por todo \n" + 
                "el Gran Area Metropolitana.\n" + 
                "Contamos con diferentes tipos\n" + 
                "de pan como pan de ojaldre,\n" + 
                "Trenzas u Orejas, lo que guste.";
        hashtags = "#Pan #GAM #PancitoRico";
        tarifa = (double) 600;
        latitud = (float) 25.753698;
        longitud = (float) -45.741259;
        
        z = new Servicio (seudonimo, tarifa, descripcion, hashtags, latitud, longitud);
        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
        
    }
}

