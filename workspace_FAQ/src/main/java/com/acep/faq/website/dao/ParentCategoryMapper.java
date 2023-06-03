package com.acep.faq.website.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.acep.faq.website.modal.Vo.ParentCategory;
import com.acep.faq.website.modal.Vo.ParentCategoryExample;

public interface ParentCategoryMapper {
    int countByExample(ParentCategoryExample example);

    int deleteByExample(ParentCategoryExample example);

    int deleteByPrimaryKey(Integer parentCategoryId);

    int insert(ParentCategory record);

    int insertSelective(ParentCategory record);

    List<ParentCategory> selectByExample(ParentCategoryExample example);

    ParentCategory selectByPrimaryKey(Integer parentCategoryId);

    int updateByExampleSelective(@Param("record") ParentCategory record, @Param("example") ParentCategoryExample example);

    int updateByExample(@Param("record") ParentCategory record, @Param("example") ParentCategoryExample example);

    int updateByPrimaryKeySelective(ParentCategory record);

    int updateByPrimaryKey(ParentCategory record);

}