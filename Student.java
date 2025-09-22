// Clase que representa a un estudiante
public class Student {
    String firstName;
    String lastName;
    String idNumber;
    int semester;
    String program;

    // Constructor: cuando creo un estudiante, le paso todos sus datos
    public Student(String firstName, String lastName, String idNumber, int semester, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.semester = semester;
        this.program = program;
    }
}
