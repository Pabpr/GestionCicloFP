/**
 * Representa a un estudiante con nombre, ID y edad.
 * 
 * @author Pablo Nuñez
 * @version 1.2
 */
public class Estudiante {

    private String nombreEstudiante;
    private int idEstudiante;
    private int edadEstudiante;

    
    /**
     * Constructor para crear un nuevo estudiante.
     * 
     * @param nombreEstudiante Nombre del estudiante.
     * @param idEstudiante Identificador único del estudiante.
     * @param edadEstudiante Edad del estudiante.
     */
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
    }

    /**
     * Obtiene el ID del estudiante.
     * 
     * @return ID del estudiante.
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * Devuelve una representación en texto del estudiante.
     * 
     * @return Información del estudiante.
     */
    public String obtenerDatosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }
}
