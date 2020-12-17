package cn.kgc.user.mapper;

import cn.kgc.bean.PmsProductSaleAttr;
import cn.kgc.bean.PmsProductSaleAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsProductSaleAttrMapper {
    int countByExample(PmsProductSaleAttrExample example);

    int deleteByExample(PmsProductSaleAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsProductSaleAttr record);

    int insertSelective(PmsProductSaleAttr record);

    List<PmsProductSaleAttr> selectByExample(PmsProductSaleAttrExample example);

    PmsProductSaleAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsProductSaleAttr record, @Param("example") PmsProductSaleAttrExample example);

    int updateByExample(@Param("record") PmsProductSaleAttr record, @Param("example") PmsProductSaleAttrExample example);

    int updateByPrimaryKeySelective(PmsProductSaleAttr record);

    int updateByPrimaryKey(PmsProductSaleAttr record);
}