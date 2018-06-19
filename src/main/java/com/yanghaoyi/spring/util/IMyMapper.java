package com.yanghaoyi.spring.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Author : YangHaoYi on 2018/5/25.
 * Email  :  yang.haoyi@qq.com
 * Description :
 * Change : YangHaoYi on 2018/5/25.
 * Version : V 1.0
 */
public interface IMyMapper<T> extends Mapper<T>,MySqlMapper<T>{
}
