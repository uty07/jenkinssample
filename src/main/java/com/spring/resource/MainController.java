package com.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
@Api(value = "HelloWorld Resource", description = "shows hello world")
public class MainController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String card_group_set_name
			, @RequestParam String network_code, @RequestParam String created_on, @RequestParam String created_by
			, @RequestParam String modified_on, @RequestParam String modified_by, @RequestParam String last_version
			, @RequestParam String module_code, @RequestParam String status, @RequestParam String language_1_message
			, @RequestParam String language_2_message, @RequestParam String sub_service, @RequestParam String service_type
			, @RequestParam String set_type,@RequestParam String is_default) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		//n.setName(name);
	//	n.setEmail(email);
		n.setCard_group_set_name(card_group_set_name);
			n.setNetwork_code(network_code);
			n.setCreated_on(created_on);
			n.setCreated_by(created_by);
			n.setModified_on(modified_on);
			n.setModified_by(modified_by);
			n.setLast_version(last_version);
			n.setModule_code(module_code);
			n.setStatus(status);
			n.setLanguage_1_message(language_1_message);
			n.setLanguage_2_message(language_2_message);
			n.setSub_service(sub_service);
			n.setService_type(service_type);
			n.setSet_type(set_type);
			n.setIs_default(is_default);
			
			
		
		
		
		
		
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
}