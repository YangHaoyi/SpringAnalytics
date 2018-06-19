package com.yanghaoyi.spring.model;

import lombok.Data;

/**
 * Author : YangHaoYi on 2018/6/12.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2018/6/12.
 * Version : V 1.0
 */
@Data
public class ClickEvent {
    private String eventName;
    private int clickCount;
}
