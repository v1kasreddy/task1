package task1.customerRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import task1.customerModel.CustomerModel;

public interface CustomerRepository extends MongoRepository<CustomerModel, String>{
		

}
