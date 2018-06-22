package com.yanghaoyi.spring.service.impl;

import com.yanghaoyi.spring.dao.ClickEventMapper;
import com.yanghaoyi.spring.dao.PageMapper;
import com.yanghaoyi.spring.model.ClickEvent;
import com.yanghaoyi.spring.model.ClickEventEntity;
import com.yanghaoyi.spring.model.PageEntity;
import com.yanghaoyi.spring.model.PageInfo;
import com.yanghaoyi.spring.service.IClickEventService;
import com.yanghaoyi.spring.service.IPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author : YangHaoYi on 2018/6/12.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2018/6/12.
 * Version : V 1.0
 */
@Service
public class ClickEventServiceImpl implements IClickEventService {

    @Autowired
    ClickEventMapper clickEventMapper;

    @Override
    public ClickEvent queryPageInfoByName(String pageName) {
        return clickEventMapper.queryClickEventByName(pageName);
    }

    @Override
    public List<ClickEvent> queryAllClickEvent() {
        return clickEventMapper.queryAllClickEvent();
    }

    @Override
    public int insertPageInfoByName(ClickEventEntity clickEventEntity) {
        return clickEventMapper.insertClickEventByName(clickEventEntity);
    }

    @Override
    public int updatePageInfoByName(ClickEventEntity clickEventEntity) {
        return clickEventMapper.updateClickEventByName(clickEventEntity);
    }

    @Override
    public int updatePageInfo(String eventName,String otherEvent,int count) {
        ClickEvent clickEvent = queryPageInfoByName(eventName);
        if(null!=clickEvent){
            ClickEventEntity clickEventEntity = new ClickEventEntity();
            clickEventEntity.setEventName(eventName);
            clickEventEntity.setOtherEvent(otherEvent);
            clickEventEntity.setCount(clickEvent.getClickCount()+count);
            updatePageInfoByName(clickEventEntity);
        }else {
            ClickEventEntity clickEventEntity = new ClickEventEntity();
            clickEventEntity.setEventName(eventName);
            clickEventEntity.setOtherEvent(otherEvent);
            clickEventEntity.setCount(count);
            insertPageInfoByName(clickEventEntity);
        }
        return 0;
    }


}
