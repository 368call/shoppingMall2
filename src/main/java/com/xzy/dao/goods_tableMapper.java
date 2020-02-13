package com.xzy.dao;

import com.xzy.model.goods_seller;
import com.xzy.model.goods_table;

import java.util.List;

public interface goods_tableMapper {
    List<goods_table> selectgoods();

    List<goods_table> searchgoods(String key);

    List<goods_seller> searchgoodshop(String key);
   }