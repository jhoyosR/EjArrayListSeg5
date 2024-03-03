package libroEj3;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Dune", "Frank Herbert", 180);
        Student student = new Student("Alice", 22, "Software engineering");
        Professor professor = new Professor("Dr. Pitt", 45, "History");

        System.out.println(book.getInfo());
        System.out.println(student.getInfo());
        System.out.println(professor.getInfo());
    }
}
