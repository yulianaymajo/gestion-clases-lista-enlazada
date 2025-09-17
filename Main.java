public class Main {
    public static void main(String[] args) {
        System.out.println("🎓 BIENVENIDO AL SISTEMA DE GESTIÓN ACADÉMICA\n");

        Class matematicas = new Class("MATH101", "Matemáticas Básicas", 3);
        System.out.println(matematicas + "\n");

        Student s1 = new Student("Carlos", "Ruiz", "2001", 1, "Sistemas");
        Student s2 = new Student("Lucía", "Mejía", "2002", 1, "Electrónica");
        Student s3 = new Student("Pedro", "Gómez", "2003", 2, "Civil");

        matematicas.enrollStudent(s1);
        matematicas.enrollStudent(s2);
        matematicas.enrollStudent(s3);

        System.out.println("\n--- LISTA ACTUAL ---");
        matematicas.listAllStudents();

        Student s4 = new Student("Ana", "López", "2002", 3, "Industrial");
        matematicas.enrollStudent(s4);

        System.out.println("\n--- ACTUALIZANDO ---");
        matematicas.updateStudent("2001", "Carlos Alberto", "Ruiz Pérez", 2, "Sistemas Avanzado");

        System.out.println("\n--- ELIMINANDO ---");
        matematicas.removeStudent("2002");

        System.out.println("\n--- LISTA FINAL ---");
        matematicas.listAllStudents();

        System.out.println("\n--- BORRANDO CLASE ---");
        matematicas.deleteClass();

        System.out.println("\n✅ FIN DEL PROGRAMA.");
    }
}