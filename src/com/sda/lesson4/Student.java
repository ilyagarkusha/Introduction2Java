package com.sda.lesson4;

public class Student {
    static int age = 0;
    public String name;
    private int id;
    private double grade;
    private String college;
    private Teacher myTeacher;


        public String getName () {
        return name;
    }

        public void setName (String name){
        this.name = name;
    }

        public int getId () {
        return id;
    }

        public void setId ( int id){
            // control input value
            if (id > 100){
                this.id = id;
            }
            else {
                this.id = -1;
            }


    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public Teacher getMyTeacher() {
        return myTeacher;
    }

    public void setMyTeacher(Teacher myTeacher) {
        this.myTeacher = myTeacher;
    }

    public Student(String name, double grade, Teacher myTeacher) {
        this.name = name;
        this.grade = grade;
        this.myTeacher = myTeacher;
    }

    public void study(){
        System.out.println(getName() + " is studying");
    }
    public void enroll(){
        System.out.println(getName() + " enrolled");
    }
    public void showMyGrade(){
        System.out.println(getName()  + " from " + getCollege() +  " grade is " + getGrade());
    }
    public void whoisMyTeacher(){
        System.out.println(getName() + " from " + getCollege() + " teacher is " + getMyTeacher().getName());
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public Student() {
    }

    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }

    public Student(String name, int id, double grade, String college) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.college = college;
    }
}
