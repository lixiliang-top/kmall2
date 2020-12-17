package cn.kgc.service;

import cn.kgc.bean.PmsBaseAttrInfo;
import cn.kgc.bean.PmsBaseAttrValue;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-16 18:51
 */
public interface AttrService {

    List<PmsBaseAttrInfo> selectPmsBaseAttrInfoAll(Long catalog3Id);

    Integer add(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> selectAttrInfoId(Long attrId);

}
