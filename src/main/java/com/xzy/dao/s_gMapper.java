package com.xzy.dao;

import com.xzy.model.s_g;
import com.xzy.model.s_gExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface s_gMapper {
    int countByExample(s_gExample example);

    int deleteByExample(s_gExample example);

    int deleteByPrimaryKey(Integer sGid);

    int insert(s_g record);

    int insertSelective(s_g record);

    List<s_g> selectByExample(s_gExample example);

    s_g selectByPrimaryKey(Integer sGid);

    int updateByExampleSelective(@Param("record") s_g record, @Param("example") s_gExample example);

    int updateByExample(@Param("record") s_g record, @Param("example") s_gExample example);

    int updateByPrimaryKeySelective(s_g record);

    int updateByPrimaryKey(s_g record);
}