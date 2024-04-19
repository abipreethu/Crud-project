package com.schoolManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class SchoolDAO {
	@Autowired
	SchoolRepo sr;
	public String post(List<School> a) {
		sr.saveAll(a);
		return "added";
	}
	public String post1(School a) {
		sr.save(a);
		return "added";
	}
	public List<School> get(){
		return sr.findAll();
	}
	public Optional<School> get1(int a) {
		return sr.findById(a);
	}
	public String delete(int a) {
		sr.deleteById(a);
		return "deleted";
	}
	public String update(int a,School b) {
		School m = sr.findById(a).get();
		m.setAge(b.getAge());
		sr.save(m);
		return "upated";
	}
}
