package com.wangcan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecurityTest {
	private List<Persion> list=new ArrayList<>();
	private int count=0;

	@RequestMapping("/springtest")
	@ResponseBody
	public Object getTest() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=count;i<count+10;i++) {
			list.add(new Persion("persion"+i));
		}
		
		return "hhahh ";
	}
	
}
