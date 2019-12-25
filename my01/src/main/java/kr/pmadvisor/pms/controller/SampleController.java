package kr.pmadvisor.pms.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ch.qos.logback.classic.Logger;

@Controller
@RequestMapping("/sample/*")
public class SampleController {

	@RequestMapping("")
	public void basic() {
		
		Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
		
		logger.info("basic.......................");
		
	}
}
