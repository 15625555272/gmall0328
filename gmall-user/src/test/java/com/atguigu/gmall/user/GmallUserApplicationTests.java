package com.atguigu.gmall.user;

import com.atguigu.gmall.beans.UmsMember;
import com.atguigu.gmall.user.mapper.UmsMemberMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GmallUserApplicationTests {

	@Autowired
	UmsMemberMapper umsMemberMapper;

	@Test
	public void contextLoads() {

		List<UmsMember> umsMembers = umsMemberMapper.selectAll();
		for (UmsMember umsMember : umsMembers) {
			System.out.println(umsMember);

		}




	}

}
