package cn.kgc.user.mapper;

import cn.kgc.bean.PmsBaseAttrValue;
import cn.kgc.bean.PmsBaseAttrValueExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PmsBaseAttrValueMapper {
    int countByExample(PmsBaseAttrValueExample example);

    int deleteByExample(PmsBaseAttrValueExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBaseAttrValue record);

    int insertSelective(PmsBaseAttrValue record);

    List<PmsBaseAttrValue> selectByExample(PmsBaseAttrValueExample example);

    PmsBaseAttrValue selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByExample(@Param("record") PmsBaseAttrValue record, @Param("example") PmsBaseAttrValueExample example);

    int updateByPrimaryKeySelective(PmsBaseAttrValue record);

    int updateByPrimaryKey(PmsBaseAttrValue record);

    int insertBatch(@Param("attrId") Long id, @Param("valueList") List<PmsBaseAttrValue> attrValueList);
}