package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
  
   /*@RequestMapping(value = "/addstudent1", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb")Student student, 
   ModelMap model) {
      model.addAttribute("firstName", student.getFName());
      model.addAttribute("lastName", student.getLName());
      model.addAttribute("fatherName", student.getFaName());
      model.addAttribute("pob", student.getPlace());
      model.addAttribute("bday", student.getDob());
      model.addAttribute("eid", student.getEid());
      model.addAttribute("pno", student.getPno());
      model.addAttribute("percentage 1", student.getPercent1(student.getm1(),student.getm2(),student.getm3()));
      model.addAttribute("percentage 2", student.getPercent2(student.getm4(),student.getm5(),student.getm6()));
      model.addAttribute("university", student.getUniv());
      model.addAttribute("course", student.getCourse());
      
      return "calci2";
   }*/
}