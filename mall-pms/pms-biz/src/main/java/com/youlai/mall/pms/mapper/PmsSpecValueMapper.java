package com.youlai.mall.pms.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youlai.mall.pms.pojo.PmsSpecValue;
import org.apache.ibatis.annotations.Select;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @author haoxr
 * @date 2020-11-06
 */
@Mapper
public interface PmsSpecValueMapper extends BaseMapper<PmsSpecValue> {


    @Select("<script>" +
            " SELECT " +
            "   id, " +
            "   spu_id, " +
            "   spec_category_id, " +
            "   value" +
            " FROM " +
            "   pms_spec_value " +
            " WHERE " +
            "   spu_id = #{spuId}  " +
            "   AND spec_category_id = #{specCategoryId} " +
            "</script>")
    List<PmsSpecValue> listBySpuIdAndSpecId(Map<String, String> param);

}
