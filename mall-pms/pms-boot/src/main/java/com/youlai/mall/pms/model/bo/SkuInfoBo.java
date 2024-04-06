package com.youlai.mall.pms.model.bo;

import lombok.Data;

/**
 * 商品库存信息BO
 *
 * @author Ray Hao
 * @since 3.3.0
 */

@Data
public class SkuInfoBo {
    /**
     * SKU的ID
     */
    private Long id;

    /**
     * 商品编号
     */
    private String skuSn;

    /**
     * 商品名称
     */
    private String spuName;

    /**
     * 商品规格名称，用于唯一标识商品的一个具体规格。
     * 例如，同一款T恤的不同尺寸（S, M, L）或颜色（红色, 绿色, 蓝色）将对应不同的skuName。
     */
    private String skuName;

    /**
     * 商品展示图片URL
     */
    private String imgUrl;
    /**
     * 价格(单位：分)
     */
    private Long price;
    /**
     * 可用库存量(库存量-已锁定库存量)
     */
    private Integer stock;

}
