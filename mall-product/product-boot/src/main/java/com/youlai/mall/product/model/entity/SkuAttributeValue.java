package com.youlai.mall.product.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * SKU规格值
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Getter
@Setter
@TableName("pms_sku_attribute_value")
public class SkuAttributeValue implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * SKU ID
     */
    private Long skuId;

    /**
     * 规格属性ID
     */
    private Long attributeId;

    /**
     * 规格属性名称
     */
    private String attributeName;

    /**
     * 规格属性值
     */
    private String attributeValue;
}
