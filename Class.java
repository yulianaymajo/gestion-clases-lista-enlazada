public class Class {
    String id;
    String name;
    int credits;
    Student head;

    public Class(String id, String name, int credits) {
        if (credits <= 0) {
            System.out.println("❌ Error: créditos deben ser positivos. Se asignará 1 por defecto.");
            this.credits = 1;
        } else {
            this.credits = credits;
        }
        this.id = id;
        this.name = name;
        this.head = null;
    }

    public boolean enrollStudent(Student newStudent) {
        Student temp = head;
        while (temp != null) {
            if (temp.idNumber.equals(newStudent.idNumber)) {
                System.out.println("❌ Ya existe un estudiante con ID: " + newStudent.idNumber);
                return false;
            }
            temp = temp.next;
        }

        newStudent.next = head;
        head = newStudent;
        System.out.println("✅ " + newStudent.firstName + " inscrito en " + name);
        return true;
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

    public boolean updateStudent(String idNumber, String firstName, String lastName, int semester, String program) {
        Student student = findStudent(idNumber);
        if (student == null) {
            System.out.println("❌ No se encontró estudiante con ID: " + idNumber);
            return false;
        }

        student.firstName = firstName;
        student.lastName = lastName;
        student.semester = semester;
        student.program = program;
        System.out.println("✅ Estudiante actualizado: " + student);
        return true;
    }

    public boolean removeStudent(String idNumber) {
        if (head == null) {
            System.out.println("❌ Lista vacía, nada que eliminar.");
            return false;
        }

        if (head.idNumber.equals(idNumber)) {
            head = head.next;
            System.out.println("✅ Estudiante eliminado (era el primero).");
            return true;
        }

        Student current = head;
        while (current.next != null && !current.next.idNumber.equals(idNumber)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("❌ Estudiante con ID " + idNumber + " no encontrado.");
            return false;
        }

        current.next = current.next.next;
        System.out.println("✅ Estudiante con ID " + idNumber + " eliminado.");
        return true;
    }

    public void listAllStudents() {
        if (head == null) {
            System.out.println("📋 " + name + " no tiene estudiantes.");
            return;
        }

        System.out.println("📋 Estudiantes en " + name + ":");
        Student temp = head;
        int i = 1;
        while (temp != null) {
            System.out.println(i + ". " + temp);
            temp = temp.next;
            i++;
        }
    }

    public void deleteClass() {
        head = null;
        System.out.println("🗑️ Clase " + name + " eliminada.");
    }

    public String toString() {
        int count = 0;
        Student temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return "Clase: " + name + " (ID: " + id + ", Créditos: " + credits + ", Estudiantes: " + count + ")";
    }
}