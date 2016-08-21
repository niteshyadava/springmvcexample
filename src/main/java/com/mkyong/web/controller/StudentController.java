package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;





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
}