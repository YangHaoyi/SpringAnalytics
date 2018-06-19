package com.yanghaoyi.spring.dao;

import com.yanghaoyi.spring.model.PageEntity;
import com.yanghaoyi.spring.model.PageInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * Author : YangHaoYi on 2018/6/12.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2018/6/12.
 * Version : V 1.0
 */
@Mapper
public interface PageMapper {

    PageInfo queryPageInfoByName(String pageName);

    List<PageInfo> queryAllPageInfo();

    int insertPageInfoByName(PageEntity pageEntity);

    int updatePageInfoByName(PageEntity pageEntity);
}
