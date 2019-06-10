package com.juns.mall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juns.mall.dto.TestDTO;
import com.juns.mall.mapper.TestMapper;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public List<TestDTO> getTest() {
		// TODO Auto-generated method stub
		System.out.println(testMapper.getTest());
//		System.out.println(testMapper.getTest().get(0).getTest_first());
		return testMapper.getTest();
	}

}
