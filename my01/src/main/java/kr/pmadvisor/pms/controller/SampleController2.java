package kr.pmadvisor.pms.controller;

import java.text.SimpleDateFormat;

import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;
import kr.pmadvisor.pms.domain.TodoDTO;

@Controller
@RequestMapping("/sample/*")
public class SampleController2 {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(java.util.Date.class, 
				new CustomDateEditor(dateFormat, false));
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		
		logger.info("todo: "+ todo);
		
		return "Info";
		
	}
	
	
}
