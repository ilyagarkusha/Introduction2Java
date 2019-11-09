package com.sda.lesson4;

public class Teacher {
    public String name;
    private Student student1;
    private Student student2;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(String name) {
        this.name = name;

    }

    public Teacher(String name, Student student1, Student student2) {
        this.name = name;
        this.student1 = student1;
        this.student2 = student2;
    }


    public static void main(String[] args) {
        Student student1 = new Student("David", 101, 4.7, "Harvard");
        Student student2 = new Student("David", 107, 3.5, "Cambridge");
        Teacher teacher = new Teacher("Helen");
        Teacher teacher2 = new Teacher("Adam");
        student1.setMyTeacher(teacher);
        student2.setMyTeacher(teacher2);

        student1.showMyGrade();
        student2.showMyGrade();
        student1.whoisMyTeacher();
        student2.whoisMyTeacher();
    }



}
