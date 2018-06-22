package com.yanghaoyi.spring.service;

import com.yanghaoyi.spring.model.ClickEvent;
import com.yanghaoyi.spring.model.ClickEventEntity;
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
public interface IClickEventService {

    ClickEvent queryPageInfoByName(String pageName);

    List<ClickEvent> queryAllClickEvent();

    int insertPageInfoByName(ClickEventEntity clickEventEntity);

    int updatePageInfoByName(ClickEventEntity clickEventEntity);

    int updatePageInfo(String pageName, String otherEvent,int count);
}
