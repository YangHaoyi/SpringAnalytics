package com.yanghaoyi.spring.controller;

import com.yanghaoyi.spring.model.ClickEvent;
import com.yanghaoyi.spring.model.PageInfo;
import com.yanghaoyi.spring.service.IClickEventService;
import com.yanghaoyi.spring.service.IPageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Author : YangHaoYi on 2018/6/12.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2018/6/12.
 * Version : V 1.0
 */
@Api(tags = "用户统计")
@RestController
@RequestMapping(value = "api/v1/analytics")
public class PageAnalyticsController {

    @Resource
    private IPageService pageService;
    @Resource
    private IClickEventService clickEventService;


    @ApiOperation(value="页面访问时间",notes="将页面访问时间存储进数据库" ,httpMethod = "POST")
    @RequestMapping(value = "/duration", method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public int updatePageInfo(@RequestBody PageInfo[] pageInfos) {
        for (PageInfo pageInfo : pageInfos) {
            pageService.updatePageInfo(pageInfo.getPageName(),pageInfo.getDuration(),pageInfo.getCount());
        }
        return 0;
    }

    @ApiOperation(value="点击事件",notes="将页面点击事件存储进数据库" ,httpMethod = "POST")
    @RequestMapping(value = "/click", method = RequestMethod.POST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public int updateClickEvent(@RequestBody ClickEvent[] clickEvents) {
        for (ClickEvent clickEvent : clickEvents) {
            clickEventService.updatePageInfo(clickEvent.getEventName(),clickEvent.getClickCount());
        }
        return 0;
    }

    @ApiOperation(value="用户信息",notes="获取用户信息" ,httpMethod = "GET")
    @RequestMapping(value = "/pageIno", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<PageInfo> getPageInfo() {
        return pageService.queryAllPageInfo();
    }

    @ApiOperation(value="点击事件信息",notes="获取用户点击事件" ,httpMethod = "GET")
    @RequestMapping(value = "/clickInfo", method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<ClickEvent> getClickInfo() {
        return clickEventService.queryAllClickEvent();
    }


}
