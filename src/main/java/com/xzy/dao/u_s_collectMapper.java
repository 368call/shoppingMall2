package com.xzy.dao;

import com.xzy.model.u_s_collect;
import com.xzy.model.u_s_collectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface u_s_collectMapper {
    int countByExample(u_s_collectExample example);

    int deleteByExample(u_s_collectExample example);

    int deleteByPrimaryKey(Integer colId);

    int insert(u_s_collect record);

    int insertSelective(u_s_collect record);

    List<u_s_collect> selectByExample(u_s_collectExample example);

    u_s_collect selectByPrimaryKey(Integer colId);

    int updateByExampleSelective(@Param("record") u_s_collect record, @Param("example") u_s_collectExample example);

    int updateByExample(@Param("record") u_s_collect record, @Param("example") u_s_collectExample example);

    int updateByPrimaryKeySelective(u_s_collect record);

    int updateByPrimaryKey(u_s_collect record);
}