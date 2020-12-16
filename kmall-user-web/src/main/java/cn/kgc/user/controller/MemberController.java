package cn.kgc.user.controller;

import cn.kgc.bean.Member;
import cn.kgc.service.MemberService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 李锡良
 * @create 2020-12-15 18:57
 */
@Controller
public class MemberController {

    @Reference
    MemberService memberService;

    @RequestMapping("/test")
    @ResponseBody
    public List<Member> test(){
        List<Member> members = memberService.selectMemberAll();
        return members;
    }

}
