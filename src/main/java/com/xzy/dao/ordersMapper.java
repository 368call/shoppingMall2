package com.xzy.dao;

import com.xzy.model.orders;
import com.xzy.model.ordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ordersMapper {
    int countByExample(ordersExample example);

    int deleteByExample(ordersExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(orders record);

    int insertSelective(orders record);

    List<orders> selectByExample(ordersExample example);

    orders selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") orders record, @Param("example") ordersExample example);

    int updateByExample(@Param("record") orders record, @Param("example") ordersExample example);

    int updateByPrimaryKeySelective(orders record);

    int updateByPrimaryKey(orders record);
}