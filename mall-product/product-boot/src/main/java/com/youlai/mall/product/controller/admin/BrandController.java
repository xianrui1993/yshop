package com.youlai.mall.product.controller.admin;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.youlai.common.result.PageResult;
import com.youlai.common.result.Result;
import com.youlai.mall.product.model.entity.Brand;
import com.youlai.mall.product.model.query.BrandPageQuery;
import com.youlai.mall.product.model.vo.BrandCategoryVO;
import com.youlai.mall.product.service.BrandService;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 品牌前端控制器
 *
 * @author Ray Hao
 * @since 2022/7/2
 */
@Tag(name = "Admin-品牌接口")
@RestController
@RequestMapping("/api/v1/brands")
@RequiredArgsConstructor
public class BrandController {

    private final BrandService brandService;

    @Operation(summary = "品牌分页列表")
    @GetMapping("/page")
    public PageResult listPagedBrands(BrandPageQuery queryParams) {

        // 查询参数
        int pageNum = queryParams.getPageNum();
        int pageSize = queryParams.getPageSize();
        String keywords = queryParams.getKeywords();

        // 分页查询
        Page<Brand> page = brandService.page(new Page<>(pageNum, pageSize),
                new LambdaQueryWrapper<Brand>().like(StrUtil.isNotBlank(keywords), Brand::getName, keywords)
                        .orderByDesc(Brand::getCreateTime));
        return PageResult.success(page);
    }

    @Operation(summary = "品牌列表")
    @GetMapping
    public Result listBrands() {
        List<Brand> list = brandService.list(new LambdaQueryWrapper<Brand>()
                .select(Brand::getId, Brand::getName));
        return Result.success(list);
    }

    @Operation(summary = "品牌表单数据")
    @GetMapping("/{id}")
    public Result getBrandDetail(@PathVariable Long id) {
        Brand brand = brandService.getById(id);
        return Result.success(brand);
    }

    @Operation(summary = "新增品牌")
    @PostMapping
    public Result addBrand(@RequestBody Brand brand) {
        boolean status = brandService.save(brand);
        return Result.judge(status);
    }

    @Operation(summary = "修改品牌")
    @PutMapping(value = "/{id}")
    public Result updateBrand(
            @PathVariable Long id,
            @RequestBody Brand brand) {
        boolean status = brandService.updateById(brand);
        return Result.judge(status);
    }

    @Operation(summary = "删除品牌")
    @DeleteMapping("/{ids}")
    public Result deleteBrands(
            @Parameter(name = "品牌ID，多个以英文逗号(,)分割") @PathVariable("ids") String ids
    ) {
        boolean status = brandService.removeByIds(Arrays.asList(ids.split(",")));
        return Result.judge(status);
    }


    @Operation(summary = "品牌分类列表")
    @GetMapping("/{brandId}/categories")
    public Result<List<BrandCategoryVO>> listBrandCategories(@PathVariable Long brandId) {



        return null;
    }
}