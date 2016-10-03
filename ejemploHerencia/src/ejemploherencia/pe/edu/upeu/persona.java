package ejemploherencia.pe.edu.upeu;

public class persona {

	String nombre;
	private int edad;
        public persona(){}
	public persona(String nombre, int edad) {
             this.nombre = nombre;
             this.edad = edad;
        }     
        public String toStringUno() {
	    return "hola, soy"+nombre;
	}

	public int cambiarEdad() {
            return edad;
	}
}