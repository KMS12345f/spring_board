//package org.bbs.membertest;
//
//import java.util.List;
//
//import org.bbs.boardtest.BoardMapperTest;
//import org.bbs.mapper.MemberMapper;
//import org.bbs.model.BoardDTO;
//import org.bbs.model.MemberDTO;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import lombok.extern.log4j.Log4j;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//@Log4j
//public class MemberMapperTest {
//	
//	@Autowired
//	private MemberMapper memberMapper;
//	
////	@Test
//	public void memberInsert() {
//		
//		MemberDTO dto = new MemberDTO();
//		
//		dto.setMname("test");
//		dto.setMphone("123-1231-2312");
//		dto.setMaddr("test");
//		dto.setMage(123);
//		dto.setMgender("man");
//		
//		memberMapper.mInsert(dto);
//
////	for(int i = 1; i<= 15; i++) {
////		MemberDTO dto = new MemberDTO();
////		dto.setMname(i + "님");
////		dto.setMphone(i + "-" + i + "-" + i);
////		dto.setMaddr(i + "동");
////		dto.setMage(i);
////		dto.setMgender("man");
////	
////		memberMapper.mInsert(dto);
////	}
//}
//	
//	
////	@Test
//	public void MemberListAllTest() {
//		
//		List<MemberDTO> list = memberMapper.list_all();
//		for(MemberDTO i : list) {
//			System.out.println(i);
//		}
//	
//	}
//	
////	@Test
//	public void MemberDeleteTest() {
//		
//		memberMapper.mDelete("4");
//	}
//
//	@Test
//	public void MemberUpdateTest() {
//		
//		MemberDTO dto = new MemberDTO();
//		dto.setMno(6);
//		dto.setMname("5번님");
//		dto.setMphone("5-5-5");
//		dto.setMaddr("5동");
//		dto.setMage(5);
//		dto.setMgender("woman");
//		
//		memberMapper.mUpdate(dto);
//
//	}
//}
