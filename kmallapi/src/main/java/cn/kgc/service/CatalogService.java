package cn.kgc.service;

import cn.kgc.bean.PmsBaseCatalog1;
import cn.kgc.bean.PmsBaseCatalog2;
import cn.kgc.bean.PmsBaseCatalog3;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-16 18:49
 */
public interface CatalogService {

    List<PmsBaseCatalog1> selectPmsBaseCataLog1All();
    List<PmsBaseCatalog2> selectPmsBaseCataLog2All(Integer catalog1Id);
    List<PmsBaseCatalog3> selectPmsBaseCataLog3All(Long catalog2Id);

}
