package com.xzy.dao;

import com.xzy.model.goods_details;
import com.xzy.model.goods_detailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface goods_detailsMapper {
    int countByExample(goods_detailsExample example);

    int deleteByExample(goods_detailsExample example);

    int deleteByPrimaryKey(Integer detailsId);

    int insert(goods_details record);

    int insertSelective(goods_details record);

    List<goods_details> selectByExample(goods_detailsExample example);

    goods_details selectByPrimaryKey(Integer detailsId);

    int updateByExampleSelective(@Param("record") goods_details record, @Param("example") goods_detailsExample example);

    int updateByExample(@Param("record") goods_details record, @Param("example") goods_detailsExample example);

    int updateByPrimaryKeySelective(goods_details record);

    int updateByPrimaryKey(goods_details record);
}