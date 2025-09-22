// Clase que representa un curso con estudiantes
public class ClassRoom {
    String id;         // código de la materia
    String name;       // nombre de la materia
    int credits;       // cantidad de créditos
    LinkedList students; // lista enlazada de estudiantes inscritos

    // Constructor: creo la clase con sus datos
    public ClassRoom(String id, String name, int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Los créditos deben ser positivos.");
        }
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.students = new LinkedList(); // inicio la lista vacía
    }

    // Agregar estudiante en orden de registro
    public void addStudent(Student s) {
        if (students.findStudent(s.idNumber) != null) {
            System.out.println("Error: ya existe un estudiante con id " + s.idNumber);
            return;
        }
        students.insertAtEnd(s); // aquí garantizo que se guarde en el orden en que llega
    }

    // Actualizar datos de un estudiante
    public void updateStudent(String idNumber, String newFirstName, String newLastName, int newSemester, String newProgram) {
        Student s = students.findStudent(idNumber);
        if (s == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }
        s.firstName = newFirstName;
        s.lastName = newLastName;
        s.semester = newSemester;
        s.program = newProgram;
        System.out.println("Estudiante actualizado.");
    }

    // Eliminar estudiante
    public void removeStudent(String idNumber) {
        students.removeStudent(idNumber);
    }

    // Mostrar todos los estudiantes
    public void showStudents() {
        students.showStudents();
    }

    // Vaciar lista de estudiantes
    public void clearStudents() {
        students.clearStudents();
    }
}


