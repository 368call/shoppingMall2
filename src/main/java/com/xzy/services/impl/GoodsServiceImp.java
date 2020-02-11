package com.xzy.services.impl;

import com.xzy.dao.goods_tableMapper;
import com.xzy.model.goods_table;
import com.xzy.services.goods_Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("Goods_select")
public class GoodsServiceImp implements goods_Service {
    @Resource
    goods_tableMapper goods;
    @Override
    public List<goods_table> selectgoods() {
        return goods.selectgoods();
    }
}
