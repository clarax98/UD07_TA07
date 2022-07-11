package TA07_01;
import java.util.Hashtable;
import javax.swing.JOptionPane;

public class mainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hastable para guardar los datos
		Hashtable<String, Double> alumnos = new Hashtable<String, Double>();
		
		//Guardar datos introducidos
		alumnos = pedirDatos (alumnos);
		
		//Imprimir por terminal los datos almacenados
		alumnos.entrySet().forEach( entry -> {
		    System.out.println( entry.getKey() + " -> " + entry.getValue() );
		});
	}
	
	//Metodo que pide los datos al usuario y devuelve la hastable pprincipal
	public static Hashtable<String, Double> pedirDatos (Hashtable<String,Double> alumnos){
		String nombreAlumno;
		
		do {
			nombreAlumno = JOptionPane.showInputDialog("Nombre del alumno (Q para dejar de introducir nombres)");
			if(!nombreAlumno.equals("Q")){
				//Almacenar datos pedidos por pantalla 
				alumnos.put(nombreAlumno, pedirNotas(nombreAlumno));
			}
		} while (!nombreAlumno.equals("Q"));
		
		//Devolver la hashtable con datos
		return alumnos;
	}
	
	//Metodo que pide las notas de un alumno y calcula la media aritmetica
	public static double pedirNotas (String nombreAlumno){
		JOptionPane.showMessageDialog(null, "A continuacion introduce las notas del alumno: "+nombreAlumno+" Introduce Q para dejar de introducir notas");
		double notaMedia = 0;
		int cantidadNotas = 0;
		String entrada = "";
		do {
			//Pedir nota
			entrada = JOptionPane.showInputDialog("Nota Alumno");
			
			//If para evitar calcular la media con datos erroneos al introducir Q
			if(!entrada.equals("Q")){
				//Aumentar variable de cantidad de notas
				cantidadNotas++;
				//Sumar la entrada de teclado para posteriormente calcular la media aritmetica
				notaMedia += Double.parseDouble(entrada);
			}
		} while (!entrada.equals("Q"));
		
		//Calcular la media final del alumno
		notaMedia = notaMedia / cantidadNotas;
		
		//Devolver media aritmetica
		return notaMedia;
	}
}
