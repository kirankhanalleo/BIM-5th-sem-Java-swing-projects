package com.java2gui_kiran_A_19;
public class KiranStudent {
    private int studentId;
    private String name;
    private String address;
    private int rollNo;
    private String faculty;
    public KiranStudent(int studentId, String name, String address, int rollNo, String faculty) {
        this.studentId = studentId;
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
        this.faculty = faculty;
    }
    public int getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getRollNo() {
        return rollNo;
    }
    public String getFaculty() {
        return faculty;
    }
}
