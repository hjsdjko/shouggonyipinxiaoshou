package com.dao;

import com.entity.QiugouEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QiugouView;

/**
 * 手工艺品求购 Dao 接口
 *
 * @author 
 */
public interface QiugouDao extends BaseMapper<QiugouEntity> {

   List<QiugouView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
