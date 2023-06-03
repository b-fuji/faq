package com.acep.faq.website.controller;

import com.acep.faq.website.modal.Vo.ChildCategory;
import com.acep.faq.website.modal.Vo.Contents;
import com.acep.faq.website.modal.Vo.ParentCategory;
import com.acep.faq.website.service.IAdminService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.annotation.Resource;
/**
 * FAQ内容追加機能
 * @author sha
 *
 */
@Controller
public class ContentsController {
	
    @Resource
    private IAdminService adminService;

    
    /**
     * FAQ新規登録
     * @param 
     * @return
     */
    @RequestMapping("/addFaq")
    @ResponseBody
    public String addContent(Contents content){
        boolean res=adminService.addContent(content);
        if(res){
            return "true";
        }
        return "false";
    }
    
    /**
     * 親カテゴリーを取得
     * @return
     */
    @RequestMapping("/findAllParentCategory")
    @ResponseBody
    public List<ParentCategory> findAllParentCategory(){
        return adminService.getParentCategorys();
    }

    /**
     * 子カテゴリーを取得
     * @return
     */
    @RequestMapping("/findAllChildCategory")
    @ResponseBody
    public List<ChildCategory> findAllChildCategory(){
        return adminService.getChildCategorys();
    }



}
