package com.xzy.services.impl;

import com.xzy.dao.goods_tableMapper;
import com.xzy.model.goods_seller;
import com.xzy.services.searchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class searchServiceImp implements searchService {
    @Resource
    goods_tableMapper goods;
    @Override
    public List<goods_seller> search(String key) {
        return goods.searchgoodshop(key);
    }
}
