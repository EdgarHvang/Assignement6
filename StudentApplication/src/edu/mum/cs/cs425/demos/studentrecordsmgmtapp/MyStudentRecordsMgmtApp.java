package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class MyStudentRecordsMgmtApp {


    public static void main(String[] args) {
//        s1: studentId:110001, name:Dave, dateOfAdmission:11/18/1951
//        s2: studentId:110002, name:Anna, dateOfAdmission:12/07/1990
//        s3: studentId:110003, name:Erica, dateOfAdmission:01/31/1974
//        s4: studentId:110004, name:Carlos, dateOfAdmission:08/22/2009
//        s5: studentId:110005, name:Bob, dateOfAdmission:03/05/1990
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Dave","110001", LocalDate.parse("1951-11-18"));
        Student student2 = new Student("Anna","110002", LocalDate.parse("1990-07-12"));
        Student student3 = new Student("Erica","110003", LocalDate.parse("1974-01-31"));
        Student student4 = new Student("Carlos","110004", LocalDate.parse("2009-08-22"));
        Student student5 = new Student("Bob","110005", LocalDate.parse("1990-03-05"));
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        printListOfStudents(students);

        System.out.println("-----------");
        printListOfStudents(getListOfPlatinumAlumniStudents(students));

        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(5);
        nums.add(7);
        nums.add(14);
        nums.add(15);
        nums.add(5);
        nums.add(35);

        System.out.println("-----------");
        printHelloWorld(nums);
        System.out.println("-----------");
        System.out.println(findSecondBiggest(nums));
    }

    static private void printListOfStudents(List<Student> students) {
        students.stream().sorted((s1,s2)-> s1.getDateOfAdminssion().compareTo(s1.getDateOfAdminssion())).collect(Collectors.toList())
                        .forEach(s -> System.out.println(s));
    }

    static private List<Student> getListOfPlatinumAlumniStudents(List<Student> students) {
       return students.stream().
               filter(s -> s.getDateOfAdminssion()
                       .isBefore(LocalDate.parse("1970-01-01")))
                        .collect(Collectors.toList());
    }

    static private void printHelloWorld(List<Integer> nums) {
        for (int i : nums) {
            if (i % 5 == 0 ) System.out.println("Hello");
            if (i % 7 == 0) System.out.println("World");
            if (i % 35 == 0) System.out.println("Hello World");
        }
    }

    static private int findSecondBiggest(List<Integer> nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < nums.size();i++){
            if(nums.get(i) > max){
                second = max;
                max = nums.get(i);
            }
            else if (nums.get(i) > second){
                second = nums.get(i);
            }
        }
        return second;
    }


}
