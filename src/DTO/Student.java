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
public class Student {
    private String studentID;
    private String studentName;
    private Date dateOfBirth;
    private String gender;
    private String phone;
    private String email;
    private int status;
    private String image;
    private String classID;
    private String ethnicID;
    private String religionID;
    
    public Student () {
        
    }

    public Student(String studentID, String studentName, Date dateOfBirth, String gender, String phone, String email, int status, String image, String classID, String ethnicID, String religionID) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.status = status;
        this.image = image;
        this.classID = classID;
        this.ethnicID = ethnicID;
        this.religionID = religionID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getEthnicID() {
        return ethnicID;
    }

    public void setEthnicID(String ethnicID) {
        this.ethnicID = ethnicID;
    }

    public String getReligionID() {
        return religionID;
    }

    public void setReligionID(String religionID) {
        this.religionID = religionID;
    }
    
    
}
