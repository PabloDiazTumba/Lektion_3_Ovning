package com.Pablo.demo;

import com.Pablo.demo.models.Student;

public class Main {
    public static void main(String[] args) {

        //Instantiate Object
        Student benny = new Student("Benny", 15);
        Student frida = new Student( "Frida", 22);

        System.out.println("Name: " + benny.name + " Age: " + benny.age);

        System.out.println("Name: " + frida.name + " Age: " + frida.age);



//--------------------------------------------------------------------------------


        /* Uppgift 5
        Change your Visibility modifier for your variables inside of the
        Student Class.
        Private - Protected - Nothing - Public
        What happens?

        Private: C:\Users\Admin\IdeaProjects\Lektion_3_Ovning\src\com\Pablo\demo\Main.java:12:43
                 java: name has private access in com.Pablo.demo.models.Student
                 Main filen kan inte få access till variablerna eftersom dom inte är publika variabler.
         */

//--------------------------------------------------------------------------------

        /* Uppgift 6
        Create a for-loop,
        generate 5 Students with unique ages
         */

        String[] names = {"Batman", "Wonderwoman", "Superman", "Spiderman", "Ironman"};
        Student[] students = new Student[names.length];

        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], 15 + i);
        }

        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }

        //--------------------------------------------------------------------------------

        /* Uppgift 7
            Inside Student Class,
            create a new method named: doubleMyAge:
            that takes in one argument: age
            Multiply it by 2
            Returns: sum
            Call this class’s method inside Main.
         */

        Student student = new Student("Captain America", 17);

        double result = student.doubleMyAge(student.age);

        System.out.println("Double of age is: " + result);

    }
}