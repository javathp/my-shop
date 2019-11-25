package com.baibo.myshop.web.ui.api;

import com.baibo.myshop.commons.utils.HttpClientUtils;
import com.baibo.myshop.commons.utils.MapperUtils;
import com.baibo.myshop.web.ui.dto.TbContent;

import java.util.List;

/**
 * 内容管理接口
 * <p>Title: ContentsApi</p>
 * <p>Description: </p>
 *
 * Author:javathp
 * Date:Created in  14:42 2019/11/19
 * Modified by:
 */
public class ContentsApi {

    /**
     * 请求幻灯片
     *
     * @return
     */
    public static List<TbContent> ppt() {
        List<TbContent> tbContents = null;
        String result = HttpClientUtils.doGet(API.API_CONTENTS_PPT);
        try {
            tbContents = MapperUtils.json2listByTree(result, "data", TbContent.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tbContents;
    }
}
