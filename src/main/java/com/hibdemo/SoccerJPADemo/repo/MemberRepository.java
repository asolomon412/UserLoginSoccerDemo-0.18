package com.hibdemo.SoccerJPADemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibdemo.SoccerJPADemo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer> {

}
