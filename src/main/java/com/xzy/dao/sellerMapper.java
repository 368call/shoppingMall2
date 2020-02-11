package com.xzy.dao;

import com.xzy.model.seller;
import com.xzy.model.sellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface sellerMapper {
    int countByExample(sellerExample example);

    int deleteByExample(sellerExample example);

    int deleteByPrimaryKey(Integer sellerId);

    int insert(seller record);

    int insertSelective(seller record);

    List<seller> selectByExample(sellerExample example);

    seller selectByPrimaryKey(Integer sellerId);

    int updateByExampleSelective(@Param("record") seller record, @Param("example") sellerExample example);

    int updateByExample(@Param("record") seller record, @Param("example") sellerExample example);

    int updateByPrimaryKeySelective(seller record);

    int updateByPrimaryKey(seller record);
}