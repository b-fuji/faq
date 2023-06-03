package com.acep.faq.website.controller;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.acep.faq.website.modal.Vo.Contents;
import com.acep.faq.website.service.IContentsService;
import com.acep.faq.website.utils.Page;

/**
 * 
 * @author sha
 *
 */
@Controller
public class IndexController extends BaseController {

	@Resource
	private IContentsService contentsService;

	/**
	 * ホームページ
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping(value = { "/", "index" })
	public String index(Model model) {
		return this.index(1, model);
	}

	/**
	 * ページ送り
	 * 
	 * @param pageNum
	 * @param model
	 * @return
	 */
	@GetMapping(value = "page/{pageNum}")
	public String index(@PathVariable int pageNum, Model model) {
		Page<Contents> page = contentsService.selectContentsByPageNum(pageNum);
		model.addAttribute("page", page);
		return this.render("index");
	}

	/**
	 * 詳細画面遷移
	 * 
	 * @param model
	 * @param cid
	 * @return
	 */
	@GetMapping(value = "contents/{cid}")
	public String getContents(Model model, @PathVariable int cid) {
		Contents contents = contentsService.getContents(cid);
		model.addAttribute("question", contents.getFaqQuestion());
		model.addAttribute("content", contents.getFaqContent());
		return this.render("post");
	}
}
