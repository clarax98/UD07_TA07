import java.util.Hashtable;
import javax.swing.JOptionPane;

public class TA07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, Double> alumnos = new Hashtable<String, Double>();
		pedirDatos (alumnos);
	}
	
	public static Hashtable<String, Double> pedirDatos (Hashtable<String,Double> alumnos){
		String nombreAlumno;
		
		do {
			nombreAlumno = JOptionPane.showInputDialog("Nombre del alumno (Q para dejar de introducir nombres)");
			if(!nombreAlumno.equals("Q")){
				alumnos.put(nombreAlumno, pedirNotas(nombreAlumno));
			}
		} while (!nombreAlumno.equals("Q"));
		return alumnos;
	}
	
	public static double pedirNotas (String nombreAlumno){
		JOptionPane.showMessageDialog(null, "A continuacion introduce las notas del alumno: "+nombreAlumno+" Introduce Q para dejar de introducir notas");
		double notaMedia = 0;
		int cantidadNotas = 0;
		String entrada = "";
		do {
			entrada = JOptionPane.showInputDialog("Nota Alumno");
			if(!entrada.equals("Q")){
				cantidadNotas++;
				notaMedia += Double.parseDouble(entrada);
			}
		} while (!entrada.equals("Q"));
		notaMedia = notaMedia / cantidadNotas;
		return notaMedia;
	}
}
