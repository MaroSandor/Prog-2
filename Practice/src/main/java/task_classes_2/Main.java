package task_classes_2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        Triangle tri2 = new Triangle(5, 7, 10);

        System.out.println(tri1);
        System.out.println(tri2);
    }
}
