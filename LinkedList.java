// Clase que representa una lista enlazada de estudiantes
public class LinkedList {
    private Node head; // la cabeza es el primer nodo de la lista

    // Método para insertar un estudiante al final (orden de registro)
    public void insertAtEnd(Student student) {
        Node newNode = new Node(student); // creo un nuevo nodo

        if (head == null) { // si la lista está vacía
            head = newNode; // el nuevo nodo pasa a ser la cabeza
            return;
        }

        // si ya hay elementos, recorro hasta el último
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        // engancho el nuevo al final
        current.next = newNode;
    }

    // Método para buscar un estudiante por ID
    public Student findStudent(String idNumber) {
        Node current = head;
        while (current != null) {
            if (current.student.idNumber.equals(idNumber)) {
                return current.student; // lo encontré
            }
            current = current.next; // avanzo al siguiente
        }
        return null; // no estaba en la lista
    }

    // Método para eliminar un estudiante por su ID
    public void removeStudent(String idNumber) {
        if (head == null) {
            System.out.println("Lista vacía, no hay estudiantes que eliminar.");
            return;
        }

        // caso especial: si el que quiero eliminar es la cabeza
        if (head.student.idNumber.equals(idNumber)) {
            head = head.next;
            System.out.println("Estudiante eliminado (era la cabeza).");
            return;
        }

        // recorro buscando al anterior del que quiero eliminar
        Node current = head;
        while (current.next != null && !current.next.student.idNumber.equals(idNumber)) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Estudiante no encontrado.");
        } else {
            current.next = current.next.next; // salto el nodo que quiero borrar
            System.out.println("Estudiante eliminado.");
        }
    }

    // Mostrar todos los estudiantes de la lista
    public void showStudents() {
        if (head == null) {
            System.out.println("No hay estudiantes inscritos.");
            return;
        }
        Node current = head;
        while (current != null) {
            Student s = current.student;
            System.out.println(s.idNumber + " - " + s.firstName + " " + s.lastName +
                               " | Sem: " + s.semester + " | Prog: " + s.program);
            current = current.next;
        }
    }

    // Vaciar la lista
    public void clearStudents() {
        head = null; // al quitar la cabeza, toda la lista queda libre
        System.out.println("Lista de estudiantes liberada.");
    }
}
