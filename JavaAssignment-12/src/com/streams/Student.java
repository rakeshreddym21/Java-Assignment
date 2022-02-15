package com.streams;

public class Student {
        private int id;
        private String name;
        private int age;
        private String gender;
        private String engDepartment;
        private int year_of_enrollment;
        private double perTillDate;

        Student(int id, String name, int age, String gender, String engDepartment, int year_of_enrollment, double perTillDate) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.engDepartment = engDepartment;
            this.year_of_enrollment = year_of_enrollment;
            this.perTillDate = perTillDate;

        }

        public int getId() {return id;}

        public String getName() {return name;}

        public int getAge() {return age;}

        public String getGender() {return gender;}

        public String getEngDepartment() {return engDepartment;}

        public int getYear_of_enrollment() {return year_of_enrollment;}

        public double getPerTillDate() {return perTillDate;}

        public String getInfo() {
              String S=name+" "+id+" "+age+" "+gender+" "+engDepartment+" "+perTillDate;
              return S;
        }


    }


