import java.util.Date; // es una clase en Java que representa un punto en el tiempo, incluyendo la fecha y la hora.
import java.time.LocalDate; // representa una fecha sin la parte de tiempo
import java.time.ZoneId; // representa una zona horaria para obtener la zona horaria del sistema.

public class Estudiantes {
    private String nombre;
    private Date fechaNacimiento;
    private double notaMateria1;
    private double notaMateria2;
    private double notaMateria3;

    public Estudiantes(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Métodos getter y setter

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    // Métodos adicionales

    /**
     * Complejidad Temporal O(1) Constante
     *
     * En la segunda linea del metodo getEdad convierte el objeto date a un obejto
     * localDate y el zoneid obtiene la zona horaria del sistema ya en la tercera
     * linea se hace que se calcula la diferencia entre el año actual y el año de
     * nacimiento del estudiante. Esto da como resultado la edad actual del
     * estudiante en años.
     */
    public int getEdad() {
        LocalDate fechaNac = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.getYear() - fechaNac.getYear();
    }

    /**
     * Complejidad Temporal O(1) Constante
     *
     * Calcula el promedio de las notas del estudiante.
     */
    public double getPromedio() {
        return (notaMateria1 + notaMateria2 + notaMateria3) / 3;
    }
}
