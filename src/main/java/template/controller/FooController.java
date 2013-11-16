package template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FooController {
	@RequestMapping({ "/", "/index" })
	public String index() {
		return "index";
	}
}