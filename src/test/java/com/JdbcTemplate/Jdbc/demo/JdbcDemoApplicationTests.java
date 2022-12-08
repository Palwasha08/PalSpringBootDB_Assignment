package com.JdbcTemplate.Jdbc.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest

class JdbcDemoApplicationTests {
	@Autowired
	private UserRepository userRepository;

	@Test
	public void findAllUsers() {
		List<User> users = userRepository.findAll();
		assertNotNull(users);
		assertTrue(!users.isEmpty());
	}

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub

	}

	@Test
	public void findUserById() {
		User user = userRepository.findUserById(1);
		assertNotNull(user);
	}

	@Test
	public void createUser() {
		User user = new User(0, "John", "john@gmail.com");
		User savedUser = userRepository.create(user);
		User newUser = userRepository.findUserById(savedUser.getId());
		assertNotNull(newUser);
		assertEquals("John", newUser.getName());
		assertEquals("john@gmail.com", newUser.getEmail());
	}
}