package org.bbs.controller;

import java.util.List;

import org.bbs.model.BoardDTO;
import org.bbs.model.User_mDTO;
import org.bbs.page.Criteria;
import org.bbs.page.ViewPage;
import org.bbs.service.BoardService;
import org.bbs.service.User_mService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@Autowired
	private BoardService boardService;

	@Autowired
	private User_mService user_mService;

	@GetMapping("/")
	public String home() {

		return "home";
	}

	@GetMapping("/register")
	public String goregister() {

		return "register";
	}

	@PostMapping("/register")
	public String register(BoardDTO dto) {

		// System.out.println("========="); // System.out.println(dto); //
		System.out.println("=========");
		boardService.insert(dto);

		return "redirect:/";
	}

	@GetMapping("/boardList")
	public String boardList(Model model, Criteria cri) {

//	 List<BoardDTO> boardList = boardService.list_all(); 
		List<BoardDTO> boardList = boardService.getListPageing(cri);
		model.addAttribute("boardList", boardList);

		int total = boardService.getTotal();
		ViewPage vp = new ViewPage(cri, total);
		model.addAttribute("pageMaker", vp);

		return "boardList";
	}

	@GetMapping("/delete")
	public String boardDelete(@RequestParam("bno") String ubno) {

		Long bno = Long.parseLong(ubno);

		boardService.delete(bno);

		return "redirect:/boardList";
	}

	@GetMapping("/oneview")
	public String boardOneView(@RequestParam("bno") String ubno, Model model) {

		Long bno = Long.parseLong(ubno);

		BoardDTO dto = boardService.oneview(bno);

		model.addAttribute("dto", dto);

		return "/boardOneView";
	}

	@GetMapping("/updateForm")
	public String updatelist(@RequestParam("bno") String ubno, Model model) {

		Long bno = Long.parseLong(ubno);

		BoardDTO dto = boardService.oneview(bno);

		model.addAttribute("dto", dto);

		return "updateForm";

	}

	@PostMapping("/update")
	public String update(BoardDTO dto, @RequestParam("bno") String bno) {

		boardService.update(dto);

		return "redirect:/oneview?bno=" + bno;
	}

	@GetMapping("/user_mForm")
	public String user_mForm() {

		return "user_mInsert";
	}

	@PostMapping("/user_mInsert")
	public String user_mInsert(User_mDTO dto) {
		user_mService.insert(dto);

		return "redirect:/user_mList";
	}

	@GetMapping("/user_mList")
	public String user_mList(Model model) {

		List<User_mDTO> user_mList = user_mService.list_all();

		model.addAttribute("user_mList", user_mList);

		return "user_mList";
	}

	@GetMapping("/user_mOneList")
	public String user_mOneView(@RequestParam("mno") String mno, Model model) {

		User_mDTO dto = user_mService.oneview(mno);

		model.addAttribute("dto", dto);

		return "/user_mOneView";
	}

	@GetMapping("/user_mDelete")
	public String user_mDelete(@RequestParam("mno") String mno) {

		user_mService.mDelete(mno);

		return "redirect:/user_mList";
	}

	@GetMapping("/user_mUpdateForm")
	public String user_mUpdateForm(@RequestParam("mno") String mno, Model model) {

		User_mDTO dto = user_mService.oneview(mno);

		model.addAttribute("dto", dto);

		return "user_mUpdateForm";
	}

	@PostMapping("/user_mUpdate")
	public String user_mUpdate(User_mDTO dto) {

		user_mService.mUpdate(dto);

		return "redirect:/user_mOneList?mno=" + dto.getMno();
	}

}