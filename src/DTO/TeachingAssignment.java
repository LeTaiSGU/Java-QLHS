/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author M S I
 */
public class TeachingAssignment {
    private String assignmentID;
    private String teacherID;
    private String classID;
    private String subjectID;
    private String dayOfWeek;
    private String period;

    public TeachingAssignment() {
    }

    public TeachingAssignment(String assignmentID, String teacherID, String classID, String subjectID, String dayOfWeek, String period) {
        this.assignmentID = assignmentID;
        this.teacherID = teacherID;
        this.classID = classID;
        this.subjectID = subjectID;
        this.dayOfWeek = dayOfWeek;
        this.period = period;
    }

    public String getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(String assignmentID) {
        this.assignmentID = assignmentID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(String subjectID) {
        this.subjectID = subjectID;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    
    
}
