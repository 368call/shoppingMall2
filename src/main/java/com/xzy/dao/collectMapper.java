package com.xzy.dao;

import com.xzy.model.collect;
import com.xzy.model.collectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface collectMapper {
    int countByExample(collectExample example);

    int deleteByExample(collectExample example);

    int deleteByPrimaryKey(Integer colId);

    int insert(collect record);

    int insertSelective(collect record);

    List<collect> selectByExample(collectExample example);

    collect selectByPrimaryKey(Integer colId);

    int updateByExampleSelective(@Param("record") collect record, @Param("example") collectExample example);

    int updateByExample(@Param("record") collect record, @Param("example") collectExample example);

    int updateByPrimaryKeySelective(collect record);

    int updateByPrimaryKey(collect record);
}