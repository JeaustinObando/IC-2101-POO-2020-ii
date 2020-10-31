
public class Servicio {
	 public String seudonimo;
	 public Double tarifa;
	 public String descripcion;
	 public String hashtags;
	 public Float latitud;
	 public Float longitud;
	 
	 public Servicio (String seudonimo, Double tarifa, String descripcion, String hashtags, Float latitud, Float longitud) {
		 this.seudonimo = seudonimo;
	     this.tarifa = tarifa;
	     this.descripcion = descripcion;
	     this.hashtags = hashtags;
	     this.latitud = latitud;
	     this.longitud = longitud;
	 }
	public String getNombre(){
         return seudonimo;
   }
   
	public void setNombre(String nombre){
         this.seudonimo = nombre;
   }
   
	public Double getTarifa(){
         return tarifa;
   }
   
	public void setTarifa(Double tarifa){
          this.tarifa = tarifa;
   }
   
	public String getDescripcion(){
         return descripcion;
   }
   
	public void setDescripcion(String descripcion){
           this.descripcion = descripcion;
   }
   
	public String getHashtags(){
           return hashtags;
   }
   
	public void setHashtags(String hashtags){
           this.hashtags = hashtags;
   }
   
	public Float getLatitud(){
         return latitud;
   }
   
	public void setLatitud(Float latitud){
           this.latitud = latitud;
   }
   
	public Float getLongitud(){
         return longitud;
   }
   
	public void setLongitud(Float longitud){
           this.longitud = longitud;
   }
   
	@Override
   	public String toString(){
       return seudonimo+
    		   "\n"+tarifa+
    		   " CRC / hora /Unidad \n\n"
    		   +descripcion+
    		   "\n\n"+hashtags+
    		   "\n\n"+latitud+
    		   ", "+longitud+ 
    		   "\n\n\n\n"; 
   }
}

