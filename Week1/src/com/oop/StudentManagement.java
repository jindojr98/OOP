package com.oop;

public class StudentManagement {
    Student[] students = new Student[100];
    int count = 0;

    public static void main(String[] args) {
        Student studentA = new Student();
        Student studentB = new Student();

        StudentManagement studentManagement = new StudentManagement();
        sameGroup(studentA,studentB);
        studentManagement.addStudent(studentA);

    }
    //5
    public static boolean sameGroup(Student s1, Student s2){
        if(s1.getGroup().equals(s2.getGroup())) return true;
        return false;
    }

    //6
    public void addStudent(Student newStudent){
        for (int i = 0; i < count; i ++) {
            if (students[i].getId() == newStudent.getId()) {
                return;
            }
        }
        if(students.length == count) {
            return;
        }
        students[count] = newStudent;
        count++;
    }

    //7
    public String studentsByGroup(){
        return null;
    }

    //8
//    public void removeStudent(String id){
//        students.removeIf(student -> student.id == id);
//    }



}
