package com.streams;


import java.util.*;
import java.util.stream.Collectors;

public class StudentsList {
    ArrayList<Student>studentList=new ArrayList<>();

    StudentsList() {
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

    }
     //All the names of department in college
    public void getDepartments() {
        studentList.stream().map(s->s.engDepartment).distinct().forEach(System.out::println);

    }
        //Students Enrolled after year
    public void EnrolledAfter2018() {
        studentList.stream().filter(s -> s.year_of_enrollment>2018).forEach((Student s) -> System.out.println(s.name));
    }
           //Students who are male cse students
    public void getMaleComputerStudents() {
        studentList.stream().filter(s -> s.gender.equals("Male") && s.engDepartment.equals("Computer Science")).forEach(s -> System.out.println(s.getFullInfo()));
    }
            // No. of MAles and females
    public void MalesAndFemales() {
        System.out.println(studentList.stream().collect(Collectors.groupingBy(s->s.gender, Collectors.counting())));
    }
//Average age
    public void avgAgeOfMalesAndFemales() {
        System.out.println("Average age of males and Females");
        System.out.println(studentList.stream().collect(Collectors.groupingBy(s->s.gender, Collectors.averagingDouble(s->s.age))));
    }
//Highest percentage of student among list
    public void detailsOfHighestPercentageStudent() {
        System.out.println(studentList.stream().max(Comparator.comparingDouble(s->s.perTillDate)).get());

    }
//Number of Students in Each dept.
    public void numOfStudentsInEachDept() {
        System.out.println(studentList.stream().collect(Collectors.groupingBy(s->s.engDepartment, Collectors.counting())));
    }
//Avg percentage in each dept.
    public void avgPercentageInEachDept() {
        System.out.println(studentList.stream().collect(Collectors.groupingBy(s->s.engDepartment, Collectors.averagingDouble(s->s.perTillDate))));

    }
//Youngest Male student in electronics
    public void youngestMaleInElectronics() {
        System.out.println( studentList.stream().filter(s -> s.engDepartment.equals("Electronic")).collect(Collectors.minBy(Comparator.comparingInt(s->s.age))).get().getFullInfo());

    }
//Number of males and females in cse
    public void malesAndFemalesInCS() {
        System.out.println(studentList.stream().filter(s -> s.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(s->s.gender, Collectors.counting())));

    }
}


