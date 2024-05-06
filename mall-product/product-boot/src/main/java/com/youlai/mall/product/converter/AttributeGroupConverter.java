package com.youlai.mall.product.converter;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.youlai.mall.product.model.entity.AttributeGroup;
import com.youlai.mall.product.model.vo.AttributeGroupPageVO;
import com.youlai.mall.product.model.form.AttributeGroupForm;
import com.youlai.mall.product.model.bo.AttributeGroupBO;

@Mapper(componentModel = "spring")
public interface AttributeGroupConverter{

    AttributeGroupPageVO bo2PageVo(AttributeGroupBO bo);

    Page<AttributeGroupPageVO> bo2PageVo(Page<AttributeGroupBO> bo);

    AttributeGroupForm entity2Form(AttributeGroup entity);

    @InheritInverseConfiguration(name = "entity2Form")
    AttributeGroup form2Entity(AttributeGroupForm entity);
}