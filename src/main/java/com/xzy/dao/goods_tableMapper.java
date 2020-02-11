package com.xzy.dao;

import com.xzy.model.User;
import com.xzy.model.goods_table;
import com.xzy.model.goods_tableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface goods_tableMapper {
    List<goods_table> selectgoods();

    List<goods_table> searchgoods(String key);
   }