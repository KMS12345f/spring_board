package org.bbs.boardtest;

import java.util.List;

import org.bbs.mapper.BoardMapper;
import org.bbs.model.BoardDTO;
import org.bbs.page.Criteria;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	@Autowired
	private BoardMapper boardMapper;
	
//	@Test
	public void boardInsertTest() {
		for(int i = 1; i<= 1000; i++) {
			BoardDTO dto = new BoardDTO();
			dto.setBtitle(i + "번 제목입니다.");
			dto.setBcontent(i + "번 내용입니다.");
			dto.setBwriter(i + "번 작성자입니다.");
		
			boardMapper.insert(dto);
		}
//		BoardDTO dto = new BoardDTO();
//		dto.setBtitle("안녕하세요gggg");
//		dto.setBcontent("테스트지롱ggg");
//		dto.setBwriter("아하하하ggg");
//
//		boardMapper.insert(dto);
//
//		log.info("========= 입력 테스트 확인 =========");
//		log.info(dto);
//		log.info("========= 입력 테스트 확인 =========");
	}
	
//	@Test
	public void boardListAllTest() {
		
		List<BoardDTO> list = boardMapper.list_all();
		for(BoardDTO i : list) {
			System.out.println(i);
		}
//		log.info("========= 입력 테스트 확인 =========");
//		boardMapper.list_all().forEach(i -> log.info(i));
//		log.info("========= 입력 테스트 확인 =========");
	}
	
//	@Test
	public void boardDelete() {
		
		boardMapper.delete(7L);
		
	}
	
//	@Test
	public void boardUpdateTest() {
		
		BoardDTO dto = new BoardDTO();
		dto.setBno(1L);
		dto.setBtitle("수정");
		dto.setBcontent("수정완료!");
		
		boardMapper.update(dto);
	}
	
	@Test
	public void pagingTest() {
		Criteria cri = new Criteria();
		
		cri.setPageNum(5);
		cri.setAmount(20);
		
		List<BoardDTO> list = boardMapper.getListPageing(cri);
		list.forEach(i->System.out.println(i));
	}
		
}
