package com.Pablo.demo.models;

        public class Student {

             public String name;
             public int age;

            // Constructor
            // Value = instantiation param
            public Student(String name, int age) {
                this.name = name;
                this.age = age;

            }

            public double doubleMyAge(int age) {
                double sum = age * 2;
                return sum;
            }
        }
