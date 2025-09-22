// Clase que representa un nodo de la lista enlazada
// Cada nodo va a guardar un estudiante y la referencia al siguiente nodo
public class Node {
    Student student; // aquí guardo el estudiante
    Node next;       // puntero al siguiente nodo

    // Constructor: cuando creo un nodo, le paso el estudiante
    public Node(Student student) {
        this.student = student;
        this.next = null; // al inicio, no apunta a nadie
    }
}
