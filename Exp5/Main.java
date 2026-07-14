import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> students = new ArrayList<>();
        students.add("Dharmit");
        students.add("Ishaan");
        students.add("Pranil");

        System.out.println("ArrayList:");
        for (String s : students) {
            System.out.println(s);
        }

        // Vector
        Vector<Integer> marks = new Vector<>();
        marks.add(85);
        marks.add(90);
        marks.add(78);

        System.out.println("\nVector:");
        for (int m : marks) {
            System.out.println(m);
        }

        // StringBuffer
        StringBuffer message = new StringBuffer("Java");
        message.append(" Programming");
        message.append(" Lab");

        System.out.println("\nStringBuffer:");
        System.out.println(message);
    }
}
