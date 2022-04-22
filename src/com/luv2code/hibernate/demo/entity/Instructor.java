package com.luv2code.hibernate.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instructor")
public class Instructor {

	//annotate the class as an entity and map to db table
	
	
		//define the fields 
		
		
		//annotate the fields with db column names
		
		
		//create constructors
		
		
		//generate getter/setter methods
		
		
		//generate toString() method
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		private String firstName;
	
		private String lastName;
		
		private String email;
	
}
