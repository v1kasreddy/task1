package task1.customerController;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import task1.customerModel.CustomerModel;
import task1.customerRepository.CustomerRepository;

	@RestController
	public class CustomerController {

		@Autowired
		private CustomerRepository repository;

		
		@GetMapping("/")
		public String homepage()
		{			return "agam agam Naganna";
		}
		@PostMapping("/AddUser")
		public String SaveData(@Valid @RequestBody CustomerModel customerModel) {
		repository.save(customerModel);
		return"Customer Details Saved Successfully";
	}
	}	
	
	