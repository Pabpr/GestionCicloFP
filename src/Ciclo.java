import java.util.ArrayList;

/**
 * Representa un ciclo de estudios que contiene una lista de estudiantes matriculados.
 * Permite agregar estudiantes y obtener información sobre el ciclo.
 * 
 * @author Pablo Nuñez
 * @version 1.2
 */
public class Ciclo {

    private String nombreCiclo;
    private ArrayList<Estudiante> listaEstudiantes;

    /**
     * Constructor para crear un nuevo ciclo.
     * 
     * @param nombreCiclo Nombre del ciclo.
     */
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
        this.listaEstudiantes = new ArrayList<>();
    }

    /**
     * Agrega un estudiante al ciclo.
     * 
     * @param estudiante Objeto de tipo Estudiante a agregar.
     */
    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    /**
     * Obtiene el nombre del ciclo.
     * 
     * @return Nombre del ciclo.
     */
    public String getNombreCiclo() {
        return nombreCiclo;
    }

    /**
     * Devuelve una representación en texto del ciclo y sus estudiantes.
     * 
     * @return Información del ciclo y lista de estudiantes.
     */
    public String obtenerDatosCiclo() {
        StringBuilder datos = new StringBuilder("Ciclo: " + nombreCiclo + "\nEstudiantes:\n");
        for (Estudiante estudiante : listaEstudiantes) {
            datos.append(estudiante.obtenerDatosEstudiante()).append("\n");
        }
        return datos.toString();
    }
}
