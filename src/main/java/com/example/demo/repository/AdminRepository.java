package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface AdminRepository extends CrudRepository<Admin, Integer> {
}
