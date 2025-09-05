public class Person {
	private int dni;
	private String nombre;
	private String apellido;

	public Person (String nombre, String apellido, int dni){
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}
    
	public String getNombre(){
	    return nombre;
	   }
	
	public String getApellido(){
	   return apellido;
	   }

	public int getDni(){
	   return dni;
	   }
	@Override
	public String toString(){
       return "Persona [nombre: " + nombre + ", apellido: " + apellido + ", dni: " + dni + "]";

	}
}