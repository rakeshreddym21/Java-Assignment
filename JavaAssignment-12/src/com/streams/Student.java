package com.streams;

public class Student {
         int id;
        String name;
        int age;
         String gender;
       String engDepartment;
         int year_of_enrollment;
        double perTillDate;

        Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.engDepartment = engDepartment;
            this.year_of_enrollment = year_of_enrollment;
            this.perTillDate = perTillDate;

        }
        public String getFullInfo() {
              String S=name+" "+id+" "+age+" "+gender+" "+engDepartment+" "+perTillDate;
              return S;
        }


    }


