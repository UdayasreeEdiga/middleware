package com.cts.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cts.model.Register;

@Repository
public interface RegisterRepo extends CrudRepository<Register, Integer> {

	Register findByUserName(String userName, String password);

	Iterable<Register> findAll();

	Optional<Register> findById(Integer id);

}
