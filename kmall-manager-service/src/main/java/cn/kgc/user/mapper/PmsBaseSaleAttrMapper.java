package cn.kgc.user.mapper;

import cn.kgc.bean.PmsBaseSaleAttr;
import cn.kgc.bean.PmsBaseSaleAttrExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseSaleAttrMapper {
    int countByExample(PmsBaseSaleAttrExample example);

    int deleteByExample(PmsBaseSaleAttrExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseSaleAttr record);

    int insertSelective(PmsBaseSaleAttr record);

    List<PmsBaseSaleAttr> selectByExample(PmsBaseSaleAttrExample example);

    PmsBaseSaleAttr selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBaseSaleAttr record, @Param("example") PmsBaseSaleAttrExample example);

    int updateByExample(@Param("record") PmsBaseSaleAttr record, @Param("example") PmsBaseSaleAttrExample example);

    int updateByPrimaryKeySelective(PmsBaseSaleAttr record);

    int updateByPrimaryKey(PmsBaseSaleAttr record);
}