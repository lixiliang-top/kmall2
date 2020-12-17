package cn.kgc.user.service;

import cn.kgc.bean.PmsBaseAttrInfo;
import cn.kgc.bean.PmsBaseAttrInfoExample;
import cn.kgc.bean.PmsBaseAttrValue;
import cn.kgc.bean.PmsBaseAttrValueExample;
import cn.kgc.service.AttrService;
import cn.kgc.user.mapper.PmsBaseAttrInfoMapper;
import cn.kgc.user.mapper.PmsBaseAttrValueMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-16 18:58
 */
@Component
@Service
public class AttrServiceImpl implements AttrService {

    @Resource
    PmsBaseAttrInfoMapper attrInfoMapper;

    @Resource
    PmsBaseAttrValueMapper attrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> selectPmsBaseAttrInfoAll(Long catalog3Id) {
        PmsBaseAttrInfoExample example = new PmsBaseAttrInfoExample();
        PmsBaseAttrInfoExample.Criteria criteria = example.createCriteria();
        criteria.andCatalog3IdEqualTo(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = attrInfoMapper.selectByExample(example);
        return pmsBaseAttrInfos;
    }

    @Override
    public Integer add(PmsBaseAttrInfo pmsBaseAttrInfo) {
        int i =0;
        //首先判断是添加还是修改，如果id==null添加
        if (pmsBaseAttrInfo.getId()==null){
            i = attrInfoMapper.insertSelective(pmsBaseAttrInfo);
        }else{
            i = attrInfoMapper.updateByPrimaryKeySelective(pmsBaseAttrInfo);
        }
        //实现批量删除
        PmsBaseAttrValueExample example = new PmsBaseAttrValueExample();
        PmsBaseAttrValueExample.Criteria criteria = example.createCriteria();
        criteria.andAttrIdEqualTo(pmsBaseAttrInfo.getId());
        i = attrValueMapper.deleteByExample(example);
        if (pmsBaseAttrInfo.getAttrValueList().size()>0){
            i = attrValueMapper.insertBatch(pmsBaseAttrInfo.getId(),pmsBaseAttrInfo.getAttrValueList());
        }
        return i;
    }

    @Override
    public List<PmsBaseAttrValue> selectAttrInfoId(Long attrId) {
        PmsBaseAttrValueExample example = new PmsBaseAttrValueExample();
        PmsBaseAttrValueExample.Criteria criteria = example.createCriteria();
        criteria.andAttrIdEqualTo(attrId);
        List<PmsBaseAttrValue> pmsBaseAttrValues = attrValueMapper.selectByExample(example);
        return pmsBaseAttrValues;
    }
}
