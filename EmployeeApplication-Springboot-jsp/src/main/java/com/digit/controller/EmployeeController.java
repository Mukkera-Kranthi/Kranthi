package com.digit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digit.entity.Employee;
import com.digit.repository.EmployeeRepository;
import com.digit.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@Autowired
	EmployeeRepository r;
	@RequestMapping("/")
	public ModelAndView getAllEmployee(){
		List<Employee> empList = service.getAllEmployee();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("employees", empList);
		return mv;
	}
	
	@GetMapping("/addEmp")
	public ModelAndView returnAddEmp() {
		ModelAndView mv=new ModelAndView("add-emp");
		mv.addObject("emp",new Employee());
		return mv;
	}
	
	
	
	
	@PostMapping("/saveEmp")
	public String insertEmployee(@ModelAttribute Employee e) {
		
		r.save(e);
		return "redirect:/";
		
		
		
	}
	@GetMapping("/employeeUpdate/{id}")
	public ModelAndView updateEmployee(@PathVariable Integer id) {
		ModelAndView mv=new ModelAndView("update");
		Employee employ=r.findById(id).get();
		mv.addObject("emp", employ);
		return mv;
		
	}
	
	
	@PostMapping("/employeeUp/{id}")
	public String updateEmp(@ModelAttribute Employee emp,@PathVariable Integer id) {
		Employee emp1=r.findById(id).get();
		emp1.setEmployeeName(emp.getEmployeeName());
		emp1.setEmployeeSalary(emp.getEmployeeSalary());
		System.out.println("hi");
		r.save(emp1);
		return "redirect:/";
		
		
	}
	
	
	@RequestMapping("/employeeDelete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		r.deleteById(id);
		return "redirect:/";
	}
    

}
