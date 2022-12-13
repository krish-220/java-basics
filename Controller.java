package com.java;

import java.util.ArrayList;
import java.util.List;
@RestController()
public class Controller {
	@GetMapping("/muthu")
	public List<Data>getData(){
		 List<Data>data = new ArrayList<>();
		data.add(new Data(123, "krish"));
		data.add(new Data(124, "krishna"));
		data.add(new Data(125, "krishnan"));
		return data;
	}

	

	}


