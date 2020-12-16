package cn.kgc.service;

import cn.kgc.bean.Member;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-15 18:29
 */
public interface MemberService {

    List<Member> selectMemberAll();

}
