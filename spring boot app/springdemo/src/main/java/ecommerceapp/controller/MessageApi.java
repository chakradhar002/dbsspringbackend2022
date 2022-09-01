package ecommerceapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* @RestController is a convenience annotation for creating Restful controllers.
 *  It is a specialization of @Component and is autodetected through classpath scanning.
 *  It adds the @Controller and @ResponseBody annotations.
 *   It converts the response to JSON or XML.*/

@RestController
public class MessageApi {
	// GET
	@GetMapping(value = "/showmessage") // this is called point
	String displayMessage() {

		return "hi how are you";

	}

}
