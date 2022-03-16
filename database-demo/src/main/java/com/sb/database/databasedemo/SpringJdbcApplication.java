//package com.sb.database.databasedemo;
//
//import java.util.Date;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import com.sb.database.databasedemo.entity.Person;
//import com.sb.database.databasedemo.jdbc.SumedhPerson;
//import com.sb.spring.databse.jpa.PersonJpaRepository;
//
//@SpringBootApplication
//
//public class SpringJdbcApplication implements CommandLineRunner {
//
//
//	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	SumedhPerson dao;
//	
//	
//
//	public static void main(String[] args) {
//		SpringApplication.run(SpringJdbcApplication.class, args);
//	}
//
//	
//	@Override
//	public void run(String... args) throws Exception {
//		
//		logger.info(" Finding User By Id -> {}", dao.findById(100));
//		
//		
//		/* logger.info(" All user -> {}", dao.findAll()); */
//		
//		System.out.println(" All user -> {}" + "" +dao.findAll());
//		 
//		 
//			/* logger.info("User id 101 -> {}", dao.findById(100)); */
//		  
//		System.out.println(" Finding User by Id -> {}" + " " + dao.findById(101));
//		
//		
//		
//		/* logger.info("User id 101 -> {}",dao.deleteById(10)); */
//		
//		 
//		  System.out.println(" Deleting By Using Id Number ->" +
//		  " Number of Rows Deleted - {}"+" "+dao.deleteById(102));
//		  
//		
//			
//		/*
//			 * logger.info("Update 101 -> {}", dao.update(new
//			 * Person(101,"Vivek","Karvenagr",new Date())));
//			 */ 
//			
//		
//			  System.out.println(" Updating User...->  User Updated - {}" + " " +
//			  dao.update(new Person( 106," Subodh "," Kothrud ", new Date())));
//			 
//		
//		
//		/*
//		 * logger.info("Insert 103 -> {}", dao.insert(new
//		 * Person(103,"Prashant","Kothrud",new Date())));
//		 */
//		
//		
//		
//		
//		  System.out.println(" New Row Entry -> Number of Rows Entered -{}" +
//		  dao.insert(new Person(" Pritam "," Anand Nagar ",new Date())));
//		 
//		
//	}
//
//}
