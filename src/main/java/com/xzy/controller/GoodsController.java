package com.xzy.controller;

import com.xzy.model.goods_seller;
import com.xzy.services.searchService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsController {
    @Resource
    searchService service;

    @RequestMapping("/search")
    public ModelAndView search(@RequestParam(required = false) String key){
        List<goods_seller> goods_sellerList=service.search(key);
        ModelAndView mav=new ModelAndView("searchTest");
        mav.addObject("goodslist",goods_sellerList);
        return mav;
    }
}
