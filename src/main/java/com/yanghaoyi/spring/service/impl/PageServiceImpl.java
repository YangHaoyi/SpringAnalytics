package com.yanghaoyi.spring.service.impl;

import com.yanghaoyi.spring.dao.PageMapper;
import com.yanghaoyi.spring.model.PageEntity;
import com.yanghaoyi.spring.model.PageInfo;
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
public class PageServiceImpl implements IPageService {

    @Autowired
    PageMapper pageMapper;

    @Override
    public PageInfo queryPageInfoByName(String pageName) {
        return pageMapper.queryPageInfoByName(pageName);
    }

    @Override
    public List<PageInfo> queryAllPageInfo() {
        return pageMapper.queryAllPageInfo();
    }

    @Override
    public int insertPageInfoByName(PageEntity pageEntity) {
        return pageMapper.insertPageInfoByName(pageEntity);
    }

    @Override
    public int updatePageInfoByName(PageEntity pageEntity) {
        return pageMapper.updatePageInfoByName(pageEntity);
    }

    @Override
    public int updatePageInfo(String pageName,long duration,int count) {
        PageInfo pageInfo = queryPageInfoByName(pageName);
        if(null!=pageInfo){
            PageEntity pageEntity = new PageEntity();
            pageEntity.setPageName(pageName);
            pageEntity.setCount(pageInfo.getCount()+1);
            updatePageInfoByName(pageEntity);
        }else {
            PageEntity pageEntity = new PageEntity();
            pageEntity.setPageName(pageName);
            pageEntity.setDuration(duration);
            pageEntity.setCount(1);
            insertPageInfoByName(pageEntity);
        }
        return 0;
    }


}
