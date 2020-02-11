package com.xzy.dao;

import com.xzy.model.bigpic;
import com.xzy.model.bigpicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface bigpicMapper {
    int countByExample(bigpicExample example);

    int deleteByExample(bigpicExample example);

    int deleteByPrimaryKey(Integer bigpicId);

    int insert(bigpic record);

    int insertSelective(bigpic record);

    List<bigpic> selectByExample(bigpicExample example);

    bigpic selectByPrimaryKey(Integer bigpicId);

    int updateByExampleSelective(@Param("record") bigpic record, @Param("example") bigpicExample example);

    int updateByExample(@Param("record") bigpic record, @Param("example") bigpicExample example);

    int updateByPrimaryKeySelective(bigpic record);

    int updateByPrimaryKey(bigpic record);
}