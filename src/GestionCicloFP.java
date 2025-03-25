import java.util.ArrayList;

/**
 * Gestiona la administración de ciclos de formación profesional y los estudiantes.
 * Permite agregar estudiantes, agregar ciclos y matricular estudiantes en ciclos.
 * 
 * @author Pablo Nuñez
 * @version 1.2
 */
public class GestionCicloFP {

    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Ciclo> listaCiclos;

    /**
     * Constructor que inicializa las listas de estudiantes y ciclos.
     */
    public GestionCicloFP() {
        this.listaEstudiantes = new ArrayList<>();
        this.listaCiclos = new ArrayList<>();
    }

    /**
     * Agrega un estudiante a la lista.
     * 
     * @param nombre Nombre del estudiante.
     * @param id ID del estudiante.
     * @param edad Edad del estudiante.
     */
    public void agregarEstudiante(String nombre, int id, int edad) {
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }

    /**
     * Agrega un nuevo ciclo a la lista de ciclos.
     * 
     * @param nombreCiclo Nombre del ciclo a agregar.
     */
    public void agregarCiclo(String nombreCiclo) {
        listaCiclos.add(new Ciclo(nombreCiclo));
    }

    /**
     * Matricula un estudiante en un ciclo específico.
     * 
     * @param idEstudiante ID del estudiante a matricular.
     * @param nombreCiclo Nombre del ciclo en el que se matriculará el estudiante.
     */
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
        Estudiante estudianteEncontrado = null;
        Ciclo cicloEncontrado = null;

        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdEstudiante() == idEstudiante) {
                estudianteEncontrado = estudiante;
                break;
            }
        }

        for (Ciclo ciclo : listaCiclos) {
            if (ciclo.getNombreCiclo().equals(nombreCiclo)) {
                cicloEncontrado = ciclo;
                break;
            }
        }

        if (estudianteEncontrado != null && cicloEncontrado != null) {
            cicloEncontrado.agregarEstudiante(estudianteEncontrado);
        }
    }

    /**
     * Muestra en consola todos los ciclos y sus estudiantes.
     */
    public void mostrarCiclos() {
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.obtenerDatosCiclo());
        }
    }

    /**
     * Método principal que ejecuta una prueba del sistema de gestión.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}


