class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class StudentAliasing {
    public static void main(String[] args) {

        Student s1 = new Student("Anish", 20);

        // s2 is an alias of s1
        Student s2 = s1;

        // Change the state through s1
        s1.age = 21;

        System.out.println("Student s1:");
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        System.out.println("\nStudent s2:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

        // Change through s2
        s2.name = "Anish Kumar";

        System.out.println("\nAfter changing through s2:");
        System.out.println("s1 name: " + s1.name);
        System.out.println("s2 name: " + s2.name);
    }
}