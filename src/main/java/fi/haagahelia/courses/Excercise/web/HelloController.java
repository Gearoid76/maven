package fi.haagahelia.courses.Excercise.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/hello")//will show what is written  hello 
	public String  hello() {
		return "Hello World";
	}
	
		@RequestMapping("/about")//will show what is written about 
		public String about() {
			return "This is about page";
		}
		@RequestMapping("/index")//will show what is written
		public String index() {
			return "This is IND-INDEX page";
		}
		@RequestMapping("/contact")   //will show what is written Contact-CONTACT
		public String contact() {
			return "This is Contact-CONTACT page(s)";
		}
		@RequestMapping("")   //will show what is written Contact-CONTACT
		public String defaultValue() {
			return "This is default value page -> nothing in the Brackets ";
		}

		
		
	
}
