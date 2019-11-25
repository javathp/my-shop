package com.baibo.myshop.web.ui.controller;

import com.baibo.myshop.commons.utils.HttpClientUtils;
import com.baibo.myshop.web.ui.api.ContentsApi;
import com.baibo.myshop.web.ui.dto.TbContent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Author:javathp
 * Date:Created in  14:42 2019/11/17
 * Modified by:
 */
@Controller
public class IndexController {

    @GetMapping(value = {"","index"})
    public String index(Model model){
//        请求幻动片
        requestContensPPT(model);
        return "index";
    }
    /**
     * 功能描述:请求幻动片
     * @param: model 
     * @author javathp
     * @date 2019-11-19
     */
    private void requestContensPPT(Model model){
        List<TbContent> tbContents = ContentsApi.ppt();
        model.addAttribute("ppt",tbContents);
    }
}
