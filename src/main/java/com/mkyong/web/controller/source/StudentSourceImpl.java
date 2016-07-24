/*package com.mkyong.web.controller.source;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mkyong.web.controller.dao.PersonDAO;
import com.mkyong.web.controller.Person;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentDAO studentDAO;

	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}

	@Override
	@Transactional
	public void addStudent(Student s) {
		this.studentDAO.addStudent(s);
	}

	@Override
	@Transactional
	public void updateStudent(Student s) {
		this.studentDAO.updateStudent(s);
	}

	@Override
	@Transactional
	public List<Student> listStudent() {
		return this.studentDAO.listStudent();
	}

	@Override
	@Transactional
	public Person getStudentById(int id) {
		return this.studentDAO.getStudentById(id);
	}

	@Override
	@Transactional
	public void removeStudent(int id) {
		this.studentDAO.removeStudent(id);
	}

*/