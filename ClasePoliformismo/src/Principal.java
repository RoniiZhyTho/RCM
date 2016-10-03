
import com.sun.org.apache.bcel.internal.generic.RETURN;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import pe.edu.upeu.Entrenador;
import pe.edu.upeu.Futbolista;
import pe.edu.upeu.Masajista;
import pe.edu.upeu.SeleccionFutbol;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alumnos
 */
public class Principal {
    BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
    
    public int leerTeclado(String dato) {
        int datos=0;
        try {datos=Integer.parseInt(dato);
        } catch (Exception e) { System.out.println("Error"+e.getMessage());}
        return datos;
            }
    public int leerTeclado (double dato){
        int datos =0;
        try{ datos=(int)dato;
        
        } catch (Exception e){ System.out.println("Error"+e.getMessage());}
        return datos;
    }
    
    public static ArrayList<SeleccionFutbol> 
            integrantes=new ArrayList<SeleccionFutbol>();
    public static void main(String [] arg){
        Principal cp = new Principal();
        Object dato=null;
        try { 
            System.out.println("Ingrese un Dato:");
            dato=cp.teclado.readLine();
            }catch (Exception e) {
        }
        System.out.println(cp.leerTeclado(dato.toString()));
        System.out.println(cp.leerTeclado('5'));
        System.out.println(cp.leerTeclado(45.15));
        //fin Uso de Sobrecarga de metodo
        
        SeleccionFutbol Entrenador = new Entrenador(5421, 1, "Vicente", "del Bosque", 60);
        SeleccionFutbol Futbolista = new Futbolista(6, "Interior Derecho", 2, "Andres", "Iniesta", 30);
        SeleccionFutbol Masajista = new Masajista("Licenciado en Fisioterapia", 10, 3, "Raul", "Cosi", 40);
        
        integrantes.add(Entrenador);
        integrantes.add(Futbolista);
        integrantes.add(Masajista);
        //Reuniones o Concentracion
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+""
                    +integrante.getApellidos()+" ->");
                    integrante.Concentrarse();
        }
        //Entrenamientos
            System.out.println("........");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+""
                    +integrante.getApellidos()+" ->");
                    integrante.entrenamiento();
        }
        //Partido de Futbol
            System.out.println("........");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre()+""
                    +integrante.getApellidos()+" ->");
                    integrante.partidoFutbol();
    } 
}
}