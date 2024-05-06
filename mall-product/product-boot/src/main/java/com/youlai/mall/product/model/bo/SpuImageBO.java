package com.youlai.mall.product.model.bo;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * 商品图片
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Getter
@Setter
public class SpuImageBO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long spuId;

    private String imgUrl;
}