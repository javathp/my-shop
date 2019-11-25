package com.baibo.myshop.web.api.web.dto;

import lombok.Data;

/**
 * 内容数据传输对象
 * Author:javathp
 * Date:Created in  12:09 2019/11/17
 * Modified by:
 */
@Data
public class TbContentDTO {

    private Long id;
    private String title;
    private String subTitle;
    private String titleDesc;
    private String url;
    private String pic;
    private String pic2;
}
