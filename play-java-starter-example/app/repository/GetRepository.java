package repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Customer;


public class GetRepository implements JpaRepository<Customer, Integer> {
	
	@Query("Select cus form customer where cus.isDeleted=:isDeleted")
	List <Customer> findCustomer(@Param("isDeleted")Integer isDeleted);
}
