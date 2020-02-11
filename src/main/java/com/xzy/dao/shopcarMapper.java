package com.xzy.dao;

import com.xzy.model.shopcar;
import com.xzy.model.shopcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface shopcarMapper {
    int countByExample(shopcarExample example);

    int deleteByExample(shopcarExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(shopcar record);

    int insertSelective(shopcar record);

    List<shopcar> selectByExample(shopcarExample example);

    shopcar selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") shopcar record, @Param("example") shopcarExample example);

    int updateByExample(@Param("record") shopcar record, @Param("example") shopcarExample example);

    int updateByPrimaryKeySelective(shopcar record);

    int updateByPrimaryKey(shopcar record);
}