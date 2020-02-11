package com.xzy.dao;

import com.xzy.model.evaluate;
import com.xzy.model.evaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface evaluateMapper {
    int countByExample(evaluateExample example);

    int deleteByExample(evaluateExample example);

    int deleteByPrimaryKey(Integer comId);

    int insert(evaluate record);

    int insertSelective(evaluate record);

    List<evaluate> selectByExample(evaluateExample example);

    evaluate selectByPrimaryKey(Integer comId);

    int updateByExampleSelective(@Param("record") evaluate record, @Param("example") evaluateExample example);

    int updateByExample(@Param("record") evaluate record, @Param("example") evaluateExample example);

    int updateByPrimaryKeySelective(evaluate record);

    int updateByPrimaryKey(evaluate record);
}