package cn.kgc.user.service;

import cn.kgc.bean.Member;
import cn.kgc.bean.MemberExample;
import cn.kgc.service.MemberService;
import cn.kgc.user.mapper.MemberMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-15 18:30
 */
@Component
@Service
public class MemberServiceImpl implements MemberService {

    @Resource
    MemberMapper memberMapper;

    @Override
    public List<Member> selectMemberAll() {
        MemberExample example = new MemberExample();
        MemberExample.Criteria criteria = example.createCriteria();
        List<Member> members = memberMapper.selectByExample(example);
        return members;
    }
}
