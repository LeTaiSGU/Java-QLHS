/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author M S I
 */
public class Class {
    private String classID;
    private String className;
    private int quantity;
    private String teacherID;
    private String gradeID;

    public Class() {
    }

    
    public Class(String classID, String className, int quantity, String teacherID, String gradeID) {
        this.classID = classID;
        this.className = className;
        this.quantity = quantity;
        this.teacherID = teacherID;
        this.gradeID = gradeID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getGradeID() {
        return gradeID;
    }

    public void setGradeID(String gradeID) {
        this.gradeID = gradeID;
    }
    
    
    

}
