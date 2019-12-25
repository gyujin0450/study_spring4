package kr.pmadvisor.pms.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.classic.Logger;
import kr.pmadvisor.pms.domain.SampleDTO;

@Controller
@RequestMapping("/sample/*")
public class SampleController {

	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/basic")
	public void basic() {
		
		logger.info("basic.......................");
		
	}
	
	@GetMapping("/basicGet")
	public void  basicGet() {
		
		logger.info("basic get only................");
		
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		logger.info(""+dto);
		
		return "ex01"; // /WEB-INF/views/ex01.jsp 호출
		
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name,
		@RequestParam("age") int age) {
		
			logger.info("name: " + name);
			logger.info("age: " + name);
					
			return "ex01";		
	}
	
	
	
}
