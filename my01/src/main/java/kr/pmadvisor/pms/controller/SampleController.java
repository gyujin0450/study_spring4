package kr.pmadvisor.pms.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ch.qos.logback.classic.Logger;
import kr.pmadvisor.pms.domain.SampleDTO;
import kr.pmadvisor.pms.domain.SampleDTOList;

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
		
		return "Info"; // /WEB-INF/views/info.jsp 호출
		
	}
	
	// 파라미터의 수집과 변환(p131)
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name,
		@RequestParam("age") int age) {
		
		logger.info("name: " + name);
		logger.info("age: " + name);
					
		return "Info";		
	}
	
	// 리스트 처리(p132)
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		
		logger.info("ids: " + ids);
		
		return "Info";
		
	}
	
	// 배열 처리(p133)
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
			
		logger.info("array ids: " + Arrays.toString(ids));
			
		return "Info";
			
	}
		
	// 객체 리스트 처리(p134)
	// SampleDTO와 같이 객체 타입이고 여러 개를 처리해야 한다면
	// SampleDTOList을 만들어 한번에 처리 할 수 있음
	// 요청시, [ => %5B , ] => %5D 로 변환하여 호출해야함
	// http://localhost:8080/sample/ex02Bean?list%5B0%5D.name=aaa&list%5B2%5D.name=bbb
	// 결과 : list=[SampleDTO [name=aaa, age=0], SampleDTO [name=null, age=0], SampleDTO [name=bbb, age=0]]]
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
			
		logger.info("list dtos: " + list);
			
		return "Info";
			
	}

	
	
	
}
