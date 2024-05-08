package com.youlai.mall.product.converter;

import com.youlai.mall.product.model.entity.SkuAttributeValue;
import com.youlai.mall.product.model.form.SpuForm;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SkuAttributeValueConverter {


    SkuAttributeValue convertToEntity(SpuForm.AttributeValue spec);
}