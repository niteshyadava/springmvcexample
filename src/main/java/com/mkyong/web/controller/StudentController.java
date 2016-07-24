package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/*import com.mkyong.web.controller.model.Student;
import com.mkyong.web.controller.service.StudentService;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Controller
public class StudentController  {

   @RequestMapping(value = "student", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("applicationform", "command", new Student());
   }
   
   
   
   @RequestMapping(value = "addstudent", method = RequestMethod.POST)
   public ModelAndView addStudent(@ModelAttribute("SpringWeb")Student student) {
	   ModelAndView model =  new ModelAndView("calci2");
      
      //DAo layer
      model.addObject("student", student);
      model.addObject("percentage10",""+(student.getMarks1()+student.getMarks2())/2);
      model.addObject("percentage12",""+(student.getMarks3()+student.getMarks4())/2);
      return model;
   }
   
	
	/*private StudentService studentService;
	
	@Autowired(required=true)
	@Qualifier(value="studentService")
	public void setStudentService(StudentService ss){
		this.studentService = ss;
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public String listStudents(Model model) {
		model.addAttribute("student", new student());
		model.addAttribute("listStudnts", this.studentService.listStudents());
		return "student";
	}
	
	//For add and update person both
	@RequestMapping(value= "/student/add", method = RequestMethod.POST)
	public String addStudent(@ModelAttribute("student") Student s){
		
		if(p.getId() == 0){
			//new person, add it
			this.studentService.addStudent(s);
		}else{
			//existing person, call update
			this.studentService.updateStudent(s);
		}
		
		return "redirect:/student";
		
	}
	
	@RequestMapping("/remove/{id}")
   public String removeStudent(@PathVariable("id") int id){
		
       this.studentService.removeStudent(id);
       return "redirect:/student";
   }

   @RequestMapping("/edit/{id}")
   public String editStudent(@PathVariable("id") int id, Model model){
       model.addAttribute("person", this.studentService.getStudentById(id));
       model.addAttribute("listStudents", this.studentService.listStudent());
       return "student";
   }
  */
   
}