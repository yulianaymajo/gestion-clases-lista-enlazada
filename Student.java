public class Student {
    String firstName;
    String lastName;
    String idNumber;
    int semester;
    String program;
    Student next;

    public Student(String firstName, String lastName, String idNumber, int semester, String program) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.semester = semester;
        this.program = program;
        this.next = null;
    }

    public String toString() {
        return firstName + " " + lastName + " (ID: " + idNumber + ", Sem: " + semester + ", Prog: " + program + ")";
    }
}