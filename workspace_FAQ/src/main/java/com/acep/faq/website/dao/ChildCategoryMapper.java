package com.acep.faq.website.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.acep.faq.website.modal.Vo.ChildCategory;
import com.acep.faq.website.modal.Vo.ChildCategoryExample;

public interface ChildCategoryMapper {
    int countByExample(ChildCategoryExample example);

    int deleteByExample(ChildCategoryExample example);

    int deleteByPrimaryKey(Integer childCategoryId);

    int insert(ChildCategory record);

    int insertSelective(ChildCategory record);

    List<ChildCategory> selectByExample(ChildCategoryExample example);

    ChildCategory selectByPrimaryKey(Integer childCategoryId);

    int updateByExampleSelective(@Param("record") ChildCategory record, @Param("example") ChildCategoryExample example);

    int updateByExample(@Param("record") ChildCategory record, @Param("example") ChildCategoryExample example);

    int updateByPrimaryKeySelective(ChildCategory record);

    int updateByPrimaryKey(ChildCategory record);
    
    @Select("select child_category_name from child_category where parent_category_id=#{parent_category_id}")
    public List<ChildCategory> ChildCategoryInfo(@Param("parent_category_id") int parent_category_id);
}