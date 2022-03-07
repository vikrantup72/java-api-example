package com.app.registration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.app.registration.model.User;
import com.app.registration.repository.RegistrationRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RegistrationApplicationTests {

	@Autowired
	RegistrationRepository repo;
	
	@Test
	void testCreate() {
		User u = new User();
		u.setId(3);
		u.setEmailId("shivaayup72@gmail.com");
		u.setUserName("shivaayup72");
		
		repo.save(u);
		assertNotNull(repo.findById(2).get());	
	}

}
