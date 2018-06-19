package com.yanghaoyi.spring.service;

import com.yanghaoyi.spring.model.ClickEvent;
import com.yanghaoyi.spring.model.PageEntity;
import com.yanghaoyi.spring.model.PageInfo;

import java.util.List;

/**
 * Author : YangHaoYi on 2018/6/12.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2018/6/12.
 * Version : V 1.0
 */
public interface IPageService {

    PageInfo queryPageInfoByName(String pageName);

    List<PageInfo> queryAllPageInfo();

    int insertPageInfoByName(PageEntity pageEntity);

    int updatePageInfoByName(PageEntity pageEntity);

    int updatePageInfo(String pageName, long duration, int count);
}
