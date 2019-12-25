package kr.pmadvisor.pms.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

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
	
	
}
