package com.youlai.mall.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youlai.mall.product.model.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类 Mapper 接口
 *
 * @author Ray Hao
 * @since 2024/04/20
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 删除分类
     * @param categoryId 分类ID
     * @return 影响行数
     */
    int deleteCategoryById(Long categoryId);
}