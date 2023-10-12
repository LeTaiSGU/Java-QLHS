/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author M S I
 */
public class SchoolYear {
    private String schoolYearID;
    private String year;
    private Date startDate;
    private Date endDate;

    public SchoolYear() {
    }

    public SchoolYear(String schoolYearID, String year, Date startDate, Date endDate) {
        this.schoolYearID = schoolYearID;
        this.year = year;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getSchoolYearID() {
        return schoolYearID;
    }

    public void setSchoolYearID(String schoolYearID) {
        this.schoolYearID = schoolYearID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
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
