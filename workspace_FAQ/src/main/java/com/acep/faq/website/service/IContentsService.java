package com.acep.faq.website.service;

import com.acep.faq.website.modal.Vo.Contents;
import com.acep.faq.website.utils.Page;

public interface IContentsService {
	
	/**
	 * FAQページ送りの検索
	 * @param pageNum
	 * @return
	 */
	public Page<Contents> selectContentsByPageNum(int pageNum);

	public Contents getContents(int cid);

	
	/**
	 * ホームページページ送り
	 * @param p
	 * @param limit
	 * @return
	 */
//	public PageInfo<Contents> getContents(Integer p, Integer limit);

}
