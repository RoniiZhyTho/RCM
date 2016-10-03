package ejemploherencia.pe.edu.upeu;

public class alumno extends persona {
	private int curso;
	private int nivelAcademico;
        private int monto;

    public alumno() {
    }
    public alumno(int curso, int nivelAcademico, String nombre, int edad) {
        super(nombre, edad);
        this.curso = curso;
        this.nivelAcademico = nivelAcademico;
    }  
    
	public String cambiarCurso() {
	    return "Yo "+super.nombre+" voy a cambiar por el curso de: "+curso;
	}
	public String toString() {
		throw new UnsupportedOperationException();
	}
	public String pagoMensual() {
	    return "Yo "+super.nombre+" pago un monto de :"+monto;
	}
	public void mostrarAsignatura() {
		throw new UnsupportedOperationException();
	}

}
