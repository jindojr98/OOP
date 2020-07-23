package com.oop;

public class Student {
    String name,group,email,id;

    //4
    public Student (){
        name = "Student";
        id="000";
        group="K62CB";
        email = "uet@vnu.edu.vn";
    }

    public Student(String name,String id,String email){
        this.name = name;
        this.id = id;
        group = "K62CB" ;
        this.email = email;
    }

    public Student(String name,String id,String group,String email){
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(Student s){
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    //2
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    //3
    public String getInfo(){
        return getName()+" - "+getId()+" - "+getGroup()+" - "+getEmail();
    }

    public void getInfoTest(){
        System.out.println(getName()+" - "+getId()+" - "+getGroup()+" - "+getEmail()); ;
    }

}
