package cn.kgc.user.controller;

import cn.kgc.bean.PmsBaseAttrInfo;
import cn.kgc.bean.PmsBaseCatalog1;
import cn.kgc.bean.PmsBaseCatalog2;
import cn.kgc.bean.PmsBaseCatalog3;
import cn.kgc.service.AttrService;
import cn.kgc.service.CatalogService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-16 19:04
 */
@CrossOrigin
@RestController
public class CatalogController {

    @Reference
    CatalogService catalogService;

    @RequestMapping("/getCatalog1")
    public List<PmsBaseCatalog1> getCatalog1(){
        List<PmsBaseCatalog1> pmsBaseCatalog1s = catalogService.selectPmsBaseCataLog1All();
        return pmsBaseCatalog1s;
    }

    @RequestMapping("/getCatalog2")
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id){
        List<PmsBaseCatalog2> pmsBaseCatalog2s = catalogService.selectPmsBaseCataLog2All(catalog1Id);
        return pmsBaseCatalog2s;
    }

    @RequestMapping("/getCatalog3")
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id){
        List<PmsBaseCatalog3> pmsBaseCatalog3s = catalogService.selectPmsBaseCataLog3All(catalog2Id);
        return pmsBaseCatalog3s;
    }

}
