package com.xzy.dao;

import com.xzy.model.recommend;
import com.xzy.model.recommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface recommendMapper {
    int countByExample(recommendExample example);

    int deleteByExample(recommendExample example);

    int deleteByPrimaryKey(Integer commId);

    int insert(recommend record);

    int insertSelective(recommend record);

    List<recommend> selectByExample(recommendExample example);

    recommend selectByPrimaryKey(Integer commId);

    int updateByExampleSelective(@Param("record") recommend record, @Param("example") recommendExample example);

    int updateByExample(@Param("record") recommend record, @Param("example") recommendExample example);

    int updateByPrimaryKeySelective(recommend record);

    int updateByPrimaryKey(recommend record);
}