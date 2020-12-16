package cn.kgc.user;

import cn.kgc.bean.Member;
import cn.kgc.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class KmallUserServiceApplicationTests {

	@Reference
	MemberService memberService;

	@Test
	void contextLoads() {
		List<Member> members = memberService.selectMemberAll();
		for (Member member : members) {
			System.out.println(member.toString());
		}
	}

}
