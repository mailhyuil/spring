package com.callor.school.controller;

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
<<<<<<< HEAD
=======
=======
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.callor.school.model.StudentVO;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
import com.callor.school.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
<<<<<<< HEAD
=======
=======

>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
@Controller
@RequestMapping(value="/student")
public class StudentController {
	
<<<<<<< HEAD
	/*
	 * Setter 주입
=======
<<<<<<< HEAD
	/*
	 * 
	 * Setter 주입
	 * StudentController studentController
	 * 			= new StudentController();
	 * studentController.setStService(stService);
	 * 
	 * 보통 @Autowired 를 사용한 Setter 주입방식을 사용하는데
	 * Setter 주입방식에서는 메모리 릭(leak, 누수)가 발생하기도
	 * 한다.
	 * 최근에는 생성자 주입방식을 적극 권장하고 있다
	 * 
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
	 */
	@Autowired
	@Qualifier("stServiceV1")
	private StudentService stService;
	
<<<<<<< HEAD
=======
=======
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
	// localhost:8080/school/student 또는
	// localhost:8080/school/student/ 또는
	
	@RequestMapping(value= {"","/"}, method=RequestMethod.GET)
	public String list(Model model) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 40232efce16720ffa9fdbf8d34237af595e50278
		List<StudentVO> stList = stService.selectAll();
		
		model.addAttribute("ST_LIST", stList);
		model.addAttribute("LAYOUT","ST_LIST");
		return "home";
		
=======
		model.addAttribute("LAYOUT","ST_LIST");
		return "home";
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1
	}
	
	@RequestMapping(value= "/input", method=RequestMethod.GET)
	public String input(Model model) {
		model.addAttribute("LAYOUT","ST_INPUT");
		return "home";
	}
	
<<<<<<< HEAD
	/*
	 * form에서 input 담긴 데이터를 수신하는 method
	 */
	@RequestMapping(value="/input",method=RequestMethod.POST)
	// form 에서 전달된 데이터를 VO 객체를 사용하여 받기
	public String input(StudentVO stVO) {
	
		log.debug(stVO.toString());
		stService.insert(stVO);
		return "home";
	
	}
	
	// form에서 전달된 데이터를 개별 변수로 받기
	public String input(String st_num, 
				String st_name,String st_dept,int st_grade, 
				String st_tel, String st_addr) {
		
		System.out.println("학번:" + st_num);
		System.out.println("이름:" + st_name);
		System.out.println("학과:" + st_dept);
		System.out.println("학년:" + st_grade);
		System.out.println("전화:" + st_tel);
		System.out.println("주소:" + st_addr);
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value="/st_num_check",method=RequestMethod.GET)
	public String st_num_check(String st_num) {
		
		StudentVO stVO = stService.findByNum(st_num);
		if(stVO == null) return "NOT";
		return "USE";
		
	}
	
	
=======
	@RequestMapping(value="/input", method=RequestMethod.POST)
	public String input(StudentVO stVO) {
		//System.out.println(stVO.toString());
		log.debug(stVO.toString());
		
		stService.insert(stVO);
		return "home";
	}
	
	public String input(String st_num, String st_name, String st_dept, int st_grade, String st_tel, String st_addr) {
		System.out.println("학번 : " + st_num);
		System.out.println("학번 : " + st_name);
		System.out.println("학번 : " + st_dept);
		System.out.println("학번 : " + st_grade);
		System.out.println("학번 : " + st_tel);
		System.out.println("학번 : " + st_addr);
		return "home";
	}
	
	@ResponseBody
	@RequestMapping(value="/st_num_check", method = RequestMethod.GET)
	public String st_num_check(String st_num) {

		StudentVO stVO = stService.findByNum(st_num);
		if(stVO == null) return "EMPTY";
		return "USE";
	}
>>>>>>> ae373ae3259e4071ff920c5231ee0ea91045b5e1

}
