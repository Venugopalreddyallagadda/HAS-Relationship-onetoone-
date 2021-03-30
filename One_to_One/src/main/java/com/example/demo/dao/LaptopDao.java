package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Laptop;

public interface LaptopDao extends JpaRepository<Laptop, Integer> {

}
