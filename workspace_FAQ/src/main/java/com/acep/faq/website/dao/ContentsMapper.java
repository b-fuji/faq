package com.acep.faq.website.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.acep.faq.website.modal.Vo.Contents;
import com.acep.faq.website.modal.Vo.ContentsExample;

public interface ContentsMapper {
    int countByExample(ContentsExample example);

    int deleteByExample(ContentsExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Contents record);

    int insertSelective(Contents record);

    List<Contents> selectByExampleWithBLOBs(ContentsExample example);

    List<Contents> selectByExample(ContentsExample example);

    Contents selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByExampleWithBLOBs(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByExample(@Param("record") Contents record, @Param("example") ContentsExample example);

    int updateByPrimaryKeySelective(Contents record);

    int updateByPrimaryKeyWithBLOBs(Contents record);

    int updateByPrimaryKey(Contents record);
    
    //ページ送り
    List<Contents> selectByPageNum(@Param("currIndex") int currIndex,@Param("pageSize")int pageSize);
    
    int selectAllCount();

}