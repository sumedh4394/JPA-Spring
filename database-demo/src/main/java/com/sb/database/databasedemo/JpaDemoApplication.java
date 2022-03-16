package com.sb.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sb.database.databasedemo.entity.SumedhPerson;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	
	private Logger logger =  LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		
//		System.out.println("Find User By Id :- {}"+ repository.findById(100));
//		//System.out.println("Update user by id :- {}"+repository.update());
//		
//		System.out.println("Insert data from user :->"+ repository.insert
//				(new SumedhPerson("Subodh Solanke","Hadgaon",new Date())));
//		
//		System.out.println("Update User detail " + repository.update
//				(new SumedhPerson(100," Sumedh Bendre","Nanded",new Date())));
//		
		//repository.deleteById(81);
		//	System.out.println("data deleted succefully");
		
			System.out.println("Finding all Id From data "+(repository.findAll()));
			
		//System.out.println(repository.findAll());
		//logger.info("User Info -> {}", repository.findById(100));
	
		
	}

}
