package com.youlai.mall.product.model.vo;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * 商品图片 VO
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Getter
@Setter
public class SpuImageVO implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long spuId;


    private String imgUrl;
}