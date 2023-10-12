/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Date;

/**
 *
 * @author M S I
 */
public class Semester {
    private String semesterID;
    private String schoolYearID;
    private String semesterNumber;
    private Date startDate;
    private Date endDate;

    public Semester() {
    }

    public Semester(String semesterID, String schoolYearID, String semesterNumber, Date startDate, Date endDate) {
        this.semesterID = semesterID;
        this.schoolYearID = schoolYearID;
        this.semesterNumber = semesterNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSemesterID() {
        return semesterID;
    }

    public void setSemesterID(String semesterID) {
        this.semesterID = semesterID;
    }

    public String getSchoolYearID() {
        return schoolYearID;
    }

    public void setSchoolYearID(String schoolYearID) {
        this.schoolYearID = schoolYearID;
    }

    public String getSemesterNumber() {
        return semesterNumber;
    }

    public void setSemesterNumber(String semesterNumber) {
        this.semesterNumber = semesterNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    
    
}
