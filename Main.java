// Clase principal para probar todo el sistema
public class Main {
    public static void main(String[] args) {
        // Creo una clase de programación con 3 créditos
        ClassRoom clase1 = new ClassRoom("CS101", "Programación", 3);

        // Agrego estudiantes en orden de registro
        clase1.addStudent(new Student("Juan", "Pérez", "1001", 2, "Sistemas"));
        clase1.addStudent(new Student("Ana", "García", "1002", 1, "Industrial"));
        clase1.addStudent(new Student("Luis", "Martínez", "1003", 3, "Sistemas"));

        // Mostrar listado de estudiantes
        System.out.println("Listado de estudiantes:");
        clase1.showStudents();

        // Buscar un estudiante por su id
        System.out.println("\nBuscando estudiante con id 1002:");
        Student buscado = clase1.students.findStudent("1002");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.firstName + " " + buscado.lastName);
        }

        // Actualizar estudiante
        clase1.updateStudent("1002", "Ana María", "García", 2, "Electrónica");

        // Eliminar estudiante
        clase1.removeStudent("1001");
        System.out.println("\nDespués de eliminar 1001:");
        clase1.showStudents();

        // Vaciar lista de estudiantes
        clase1.clearStudents();
        System.out.println("\nDespués de eliminar la clase:");
        clase1.showStudents();
    }
}


