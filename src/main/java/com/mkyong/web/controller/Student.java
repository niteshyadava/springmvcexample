package com.mkyong.web.controller;

import java.util.Date;

public class Student {
   private String firstName,lastName,fatherName,pob,eid,university,course;
  // private Date dob;
   private Integer marks1,marks2,pno,marks3,marks4;
  

/*public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}*/
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public String getPob() {
	return pob;
}
public void setPob(String pob) {
	this.pob = pob;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public String getUniversity() {
	return university;
}
public void setUniversity(String university) {
	this.university = university;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public Integer getMarks1() {
	return marks1;
}
public void setMarks1(Integer marks1) {
	this.marks1 = marks1;
}
public Integer getMarks2() {
	return marks2;
}
public void setMarks2(Integer marks2) {
	this.marks2 = marks2;
}
public Integer getPno() {
	return pno;
}
public void setPno(Integer pno) {
	this.pno = pno;
}
public Integer getMarks3() {
	return marks3;
}
public void setMarks3(Integer marks3) {
	this.marks3 = marks3;
}
public Integer getMarks4() {
	return marks4;
}

public void setMarks4(Integer marks4) {
	this.marks4 = marks4;
}

/*public Integer getPercent1(Integer marks1,Integer marks2) {
	percent1=(marks1+marks2)/3;
	return percent1;
}


public Integer getPercent2(Integer marks3,Integer marks4) {
	percent2=(marks3+marks4)/3;
	return percent2;
}
*/

   
}