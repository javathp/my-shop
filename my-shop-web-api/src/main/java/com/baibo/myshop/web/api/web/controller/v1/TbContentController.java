package com.baibo.myshop.web.api.web.controller.v1;

import com.baibo.myshop.domain.TbContent;
import com.baibo.myshop.domain.TbContentCategory;
import com.baibo.myshop.web.api.service.TbContentService;
import com.baibo.myshop.web.api.web.dto.TbContentDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Author:javathp
 * Date:Created in  14:58 2019/11/16
 * Modified by:
 */
@RestController
@RequestMapping(value = "${api.path.v1}/contents")
public class TbContentController {

    @Autowired
    private TbContentService tbContentService;

    @ModelAttribute
    public TbContent getTbContent(Long id){
        TbContent tbContent = null;
        if (id == null ) {
            tbContent = new TbContent();
        }
        return tbContent;
    }

    /*
    * @PathVariable路径参数
    * @RequestParam参数是否必须
    * */
    @GetMapping(value = "{category_id}")
    public List<TbContentDTO> findContentByCategoryId(@PathVariable(value = "category_id") Long categoryId){
        List<TbContentDTO> tbContentDTOS = null;
        List<TbContent> tbContents = tbContentService.selectByCategoryId(categoryId);
        if (tbContents != null && tbContents.size() > 0) {
            tbContentDTOS = new ArrayList<>();
            for (TbContent tbContent : tbContents) {
                TbContentDTO dto = new TbContentDTO();
                BeanUtils.copyProperties(tbContent,dto);
                tbContentDTOS.add(dto);
            }
        }
        return tbContentDTOS;

    }


}
