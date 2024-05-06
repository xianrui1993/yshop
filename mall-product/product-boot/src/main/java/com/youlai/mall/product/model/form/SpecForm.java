package com.youlai.mall.product.model.form;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *  表单对象
 *
 * @author Ray Hao
 * @since 2024-04-14
 */
@Getter
@Setter
public class SpecForm implements Serializable {

    private static final long serialVersionUID = 1L;

        /**
         * 规格主键
         */

private Long id;

        /**
         * SPU ID
         */

private Long spuId;

        /**
         * 规格名称
         */

private String name;
}