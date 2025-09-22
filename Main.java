public class Main {
    public static void main(String[] args) {
        
        ClassRoom clase1 = new ClassRoom("CS101", "Programación", 3);

    
        clase1.addStudentAtStart(new Student("Juan", "Pérez", "1001", 2, "Sistemas"));
        clase1.addStudentAtEnd(new Student("Ana", "García", "1002", 1, "Industrial"));
        clase1.addStudentAtEnd(new Student("Luis", "Martínez", "1003", 3, "Sistemas"));

        System.out.println("Listado de estudiantes:");
        clase1.showStudents();

       
        System.out.println("\nBuscando estudiante con id 1002:");
        Student buscado = clase1.findStudent("1002");
        if (buscado != null) {
            System.out.println("Encontrado: " + buscado.firstName + " " + buscado.lastName);
        }

        
        clase1.updateStudent("1002", "Ana María", "García", 2, "Electrónica");

        
        clase1.removeStudent("1001");
        System.out.println("\nDespués de eliminar 1001:");
        clase1.showStudents();

        
        clase1.clearStudents();
        System.out.println("\nDespués de eliminar la clase:");
        clase1.showStudents();
    }
}
