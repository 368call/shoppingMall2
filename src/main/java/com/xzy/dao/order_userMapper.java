package com.xzy.dao;

import com.xzy.model.order_user;
import com.xzy.model.order_userExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface order_userMapper {
    int countByExample(order_userExample example);

    int deleteByExample(order_userExample example);

    int deleteByPrimaryKey(Integer orderUserId);

    int insert(order_user record);

    int insertSelective(order_user record);

    List<order_user> selectByExample(order_userExample example);

    order_user selectByPrimaryKey(Integer orderUserId);

    int updateByExampleSelective(@Param("record") order_user record, @Param("example") order_userExample example);

    int updateByExample(@Param("record") order_user record, @Param("example") order_userExample example);

    int updateByPrimaryKeySelective(order_user record);

    int updateByPrimaryKey(order_user record);
}