package org.juggl.tutorials.inheritance.api;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController extends AbstractController {

	@RequestMapping(
			value = "/user",
		  produces = { "application/json" },
		  method = RequestMethod.GET
	)
	ResponseEntity<String> getUser() {
		return ResponseEntity.ok(this.getUsername());
	}
}
