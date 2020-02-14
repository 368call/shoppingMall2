package com.xzy.services;

import com.xzy.model.goods_seller;

import java.util.List;

public interface searchService {
    List<goods_seller> search(String key);
}
