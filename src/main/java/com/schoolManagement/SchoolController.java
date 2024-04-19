package com.schoolManagement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SchoolController {
	@Autowired
	SchoolService ss;
	@PostMapping("/post")
	public String post(@RequestBody List<School> a) {
		return ss.post(a);
	}
	@PostMapping("/post1")
	public String post1(@RequestBody School a) {
		return ss.post1(a);
	}
	@GetMapping("/get")
	public List<School> get(){
		return ss.get();
	}
	@GetMapping("/get1/{a}")
	public Optional<School> get1(@PathVariable int a) {
	return ss.get1(a);
	}
	@DeleteMapping("/delete/{a}")
	public String delete(@PathVariable int a) {
	return ss.delete(a);
	}
	@PutMapping("/update/{a}")
	public String update(@PathVariable int a,@RequestBody School b) {
		return ss.update(a,b);
	}
}
