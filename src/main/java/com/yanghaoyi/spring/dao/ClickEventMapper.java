package com.yanghaoyi.spring.dao;

import com.yanghaoyi.spring.model.ClickEvent;
import com.yanghaoyi.spring.model.ClickEventEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by 浩艺 on 2018/6/12.
 */
@Mapper
public interface ClickEventMapper {

    ClickEvent queryClickEventByName(String eventName);

    List<ClickEvent> queryAllClickEvent();

    int insertClickEventByName(ClickEventEntity clickEventEntity);

    int updateClickEventByName(ClickEventEntity clickEventEntity);
}
