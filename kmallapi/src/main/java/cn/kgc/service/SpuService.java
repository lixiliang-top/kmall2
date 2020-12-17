package cn.kgc.service;

import cn.kgc.bean.PmsBaseSaleAttr;
import cn.kgc.bean.PmsProductInfo;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-17 18:53
 */
public interface SpuService {

    List<PmsProductInfo> selectPmsProductInfoId(Long catalog3Id);

    List<PmsBaseSaleAttr> selectPmsBaseSaleAttrAll();

}
