package cn.kgc.user.service;

import cn.kgc.bean.PmsBaseSaleAttr;
import cn.kgc.bean.PmsBaseSaleAttrExample;
import cn.kgc.bean.PmsProductInfo;
import cn.kgc.bean.PmsProductInfoExample;
import cn.kgc.service.SpuService;
import cn.kgc.user.mapper.PmsBaseSaleAttrMapper;
import cn.kgc.user.mapper.PmsProductInfoMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-17 18:54
 */
@Component
@Service
public class SpuServiceImpl implements SpuService {

    @Resource
    PmsProductInfoMapper pmsProductInfoMapper;

    @Resource
    PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Override
    public List<PmsProductInfo> selectPmsProductInfoId(Long catalog3Id) {
        PmsProductInfoExample example = new PmsProductInfoExample();
        PmsProductInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCatalog3IdEqualTo(catalog3Id);
        List<PmsProductInfo> pmsProductInfos = pmsProductInfoMapper.selectByExample(example);
        return pmsProductInfos;
    }

    @Override
    public List<PmsBaseSaleAttr> selectPmsBaseSaleAttrAll() {
        PmsBaseSaleAttrExample example = new PmsBaseSaleAttrExample();
        PmsBaseSaleAttrExample.Criteria criteria = example.createCriteria();
        List<PmsBaseSaleAttr> pmsBaseSaleAttrs = pmsBaseSaleAttrMapper.selectByExample(example);
        return pmsBaseSaleAttrs;
    }
}
