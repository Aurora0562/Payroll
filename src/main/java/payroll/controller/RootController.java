package payroll.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import payroll.controller.EmployeeController;
import payroll.controller.OrderController;

@RestController
class RootController {

	@GetMapping
	ResourceSupport index() {
		ResourceSupport rootResource = new ResourceSupport();
		rootResource.add(linkTo(methodOn(EmployeeController.class).all()).withRel("employees"));
		rootResource.add(linkTo(methodOn(OrderController.class).all()).withRel("orders"));
		return rootResource;
	}

}
