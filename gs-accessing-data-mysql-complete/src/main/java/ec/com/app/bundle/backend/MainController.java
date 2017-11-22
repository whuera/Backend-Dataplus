package ec.com.app.bundle.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ec.com.app.bundle.backend.model.ContactSendMail;
import ec.com.app.bundle.backend.model.User;
import ec.com.app.bundle.backend.repository.UserRepository;
import ec.com.app.bundle.backend.service.ContactSendMailService;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;
	@Autowired
	private ContactSendMailService contactSendMailService;
	
	//private final static String ERROR_PATH = "/error";
	
	
	
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		userRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return userRepository.findAll();
	}
	
	@GetMapping(path="/allContacts")
	public @ResponseBody Iterable<ContactSendMail> getAllContacts() {
		// This returns a JSON or XML with the users
		return contactSendMailService.findAll();
	}
}
