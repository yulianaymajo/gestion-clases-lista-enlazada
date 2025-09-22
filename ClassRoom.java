public class ClassRoom {
    String id;
    String name;
    int credits;
    Student head;  // inicio de la lista enlazada


    public ClassRoom(String id, String name, int credits) {
        if (credits <= 0) {
            throw new IllegalArgumentException("Los créditos deben ser positivos.");
        }
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.head = null;
    }

   
    public void addStudentAtStart(Student s) {
        if (findStudent(s.idNumber) != null) {
            System.out.println("Error: ya existe un estudiante con id " + s.idNumber);
            return;
        }
        s.next = head;
        head = s;
    }

    
    public void addStudentAtEnd(Student s) {
        if (findStudent(s.idNumber) != null) {
            System.out.println("Error: ya existe un estudiante con id " + s.idNumber);
            return;
        }
        if (head == null) {
            head = s;
        } else {
            Student temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = s;
        }
    }

    
    public Student findStudent(String idNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.idNumber.equals(idNumber)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    
    public void updateStudent(String idNumber, String newFirstName, String newLastName, int newSemester, String newProgram) {
        Student s = findStudent(idNumber);
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

 
    public void removeStudent(String idNumber) {
        if (head == null) {
            System.out.println("Lista vacía, no hay estudiantes que eliminar.");
            return;
        }

        
        if (head.idNumber.equals(idNumber)) {
            head = head.next;
            System.out.println("Estudiante eliminado (era la cabeza).");
            return;
        }

        Student temp = head;
        while (temp.next != null && !temp.next.idNumber.equals(idNumber)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Estudiante no encontrado.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Estudiante eliminado.");
        }
    }

 
    public void showStudents() {
        if (head == null) {
            System.out.println("No hay estudiantes inscritos.");
            return;
        }
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.idNumber + " - " + temp.firstName + " " + temp.lastName + " | Sem: " + temp.semester + " | Prog: " + temp.program);
            temp = temp.next;
        }
    }

    
    public void clearStudents() {
        head = null;  
        System.out.println("Lista de estudiantes liberada.");
    }
}
