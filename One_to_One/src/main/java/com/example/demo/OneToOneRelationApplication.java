package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.LaptopDao;
import com.example.demo.dao.StudentDao;
import com.example.demo.model.Laptop;
import com.example.demo.model.Student;

@SpringBootApplication
public class OneToOneRelationApplication implements CommandLineRunner {

	@Autowired
	private LaptopDao laptopdao;

	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationApplication.class, args);
		System.out.println("welcome");
	}

	@Override
	public void run(String... args) throws Exception {

		saveData();
		showData();

	}

	@Transactional
	private void saveData() {
		Laptop laptop1 = new Laptop(2, "Dell");
		laptopdao.save(laptop1);

		Student s = new Student(13, "venu", 34, laptop1);
		studentDao.save(s);
		System.out.println("inserted");
	}

	@Transactional
	private void showData() {
		List<Laptop> laptops = laptopdao.findAll();
		List<Student> students = studentDao.findAll();

		System.out.println("==========Student======");
		students.forEach(System.out::println);
		System.out.println("==========Laptop======");
		laptops.forEach(System.out::println);

	}

}
