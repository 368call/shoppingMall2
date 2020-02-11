package com.xzy.service;

import com.xzy.dao.goods_tableMapper;
import com.xzy.model.goods_table;
import com.xzy.services.goods_Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class GoodsServiceImpTest {
    @Resource
   private goods_tableMapper goods;
@Test
    public void selectgood() {
        List<goods_table> good=goods.selectgoods();
        for (goods_table g:good) {
            System.out.println(g.toString());

        }
    }
}
