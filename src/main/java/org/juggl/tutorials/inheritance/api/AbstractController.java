package org.juggl.tutorials.inheritance.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.NativeWebRequest;

public class AbstractController {

	@Autowired
	protected NativeWebRequest request;

	protected String getUsername() {
		return this.request.getUserPrincipal().getName();
	}
}
