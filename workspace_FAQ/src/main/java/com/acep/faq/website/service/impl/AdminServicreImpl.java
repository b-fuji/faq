package com.acep.faq.website.service.impl;

import com.acep.faq.website.dao.AdminMapper;
import com.acep.faq.website.dao.ChildCategoryMapper;
import com.acep.faq.website.dao.ContentsMapper;
import com.acep.faq.website.dao.ParentCategoryMapper;
import com.acep.faq.website.modal.Vo.*;
import com.acep.faq.website.service.IAdminService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServicreImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;
    
    @Resource
    private ContentsMapper contentsMapper;

    
    @Resource
    private ParentCategoryMapper parentCategoryMapper;
    
    @Resource
    private ChildCategoryMapper  childCategoryMapper;
    

    
    @Override
    public boolean adminIsExist(String name) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin=adminMapper.selectByExample(adminExample);
        if(null==admin)
        return false;
        if(admin.size()<1){
            return false;
        }
        return true;
    }

    @Override
    public boolean adminLogin(String name, String password) {
        AdminExample adminExample=new AdminExample();
        AdminExample.Criteria criteria=adminExample.createCriteria();
        criteria.andAdminNameEqualTo(name);
        List<Admin> admin=adminMapper.selectByExample(adminExample);
        if(null==admin){
            return false;
        }
        for(Admin a:admin){
            if(a.getAdminPwd().equals(password)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addContent(Contents content) {
        int n=contentsMapper.insert(content);
        if(n>0){
            return true;
        }
        return false;
    }

    @Override
    public List<ParentCategory> getParentCategorys() {
    	ParentCategoryExample parentCategoryExample=new ParentCategoryExample();
        return parentCategoryMapper.selectByExample(parentCategoryExample);
    }
    
    
	@Override
	public List<ChildCategory> getChildCategorys() {
		ChildCategoryExample childCategoryExample=new ChildCategoryExample();
		return childCategoryMapper.selectByExample(childCategoryExample);
	}

    @Override
    public boolean addParentCategorys(ParentCategory parentCategory) {
        int n=parentCategoryMapper.insert(parentCategory);
        if(n>0){
            return true;
        }
        return false;
    }

	@Override
    public List<ChildCategory> ChildCategoryInfo(int parent_category_id){
    	return childCategoryMapper.ChildCategoryInfo(parent_category_id);
    }

}
