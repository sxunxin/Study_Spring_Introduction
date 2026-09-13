package sxunxin.study_spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sxunxin.study_spring.repository.MemberRepository;
import sxunxin.study_spring.repository.MemoryMemberRepository;
import sxunxin.study_spring.service.MemberService;

@Configuration
public class SpringConfig {
    
    @Bean 
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
