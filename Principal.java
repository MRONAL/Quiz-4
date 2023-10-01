import java.util.Date;

public class Principal {
    public static void main(String[] args) {
        // Crear estudiantes
        Estudiantes estudiante1 = new Estudiantes("Ronal", new Date(2005-1900, 4, 3));
        Estudiantes estudiante2 = new Estudiantes("Joseph", new Date(2005-1900,5, 21));

        // Establecer notas
        estudiante1.setNotaMateria1(25);
        estudiante1.setNotaMateria2(30);
        estudiante1.setNotaMateria3(40);

        estudiante2.setNotaMateria1(50);
        estudiante2.setNotaMateria2(40);
        estudiante2.setNotaMateria3(10);

        // Mostrar información
        System.out.println("Estudiante 1: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad() + " años");
        System.out.println("Promedio de notas: " + estudiante1.getPromedio());

        System.out.println("\nEstudiante 2: " + estudiante2.getNombre());
        System.out.println("Edad: " + estudiante2.getEdad() + " años");
        System.out.println("Promedio de notas: " + estudiante2.getPromedio());
    }
}
