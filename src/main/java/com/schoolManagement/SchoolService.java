package com.schoolManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SchoolService {
	@Autowired
	SchoolDAO sd;
	public String post(List<School> a) {
		return sd.post(a);
	}
	public String post1(School a) {
		return sd.post1(a);
	}
	public List<School> get() {
		return sd.get();
	}
	public Optional<School> get1(int a) {
		return sd.get1(a);
	}
	public String delete(int a) {
		return sd.delete(a);
	}
	public String update(int a,School b) {
		return sd.update(a,b);
	}
}
