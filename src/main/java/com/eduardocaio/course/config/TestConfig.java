package com.eduardocaio.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.eduardocaio.course.entities.Category;
import com.eduardocaio.course.entities.Order;
import com.eduardocaio.course.entities.Product;
import com.eduardocaio.course.entities.User;
import com.eduardocaio.course.entities.enums.OrderStatus;
import com.eduardocaio.course.repositories.CategoryRepository;
import com.eduardocaio.course.repositories.OrderRepository;
import com.eduardocaio.course.repositories.ProductRepository;
import com.eduardocaio.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Description test", 50.0, "URL");
		Product p2 = new Product(null, "Smart TV", "Description test", 2000.0, "URL");
		Product p3 = new Product(null, "Mackbook Pro", "Description test", 10000.0, "URL");
		Product p4 = new Product(null, "PC Gamer", "Description test", 5500.0, "URL");
		Product p5 = new Product(null, "Rails for Dummies", "Description test", 30.0, "URL");

		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2019-06-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,u2);
		Order o3 = new Order(null, Instant.parse("2019-06-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}
	
	
	
	
	
}
