package hello.whyusespring;

import hello.whyusespring.member.Grade;
import hello.whyusespring.member.Member;
import hello.whyusespring.member.MemberService;
import hello.whyusespring.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find member = " + findMember.getName());
    }
}
