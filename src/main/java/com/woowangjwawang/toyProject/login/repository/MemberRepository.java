package com.woowangjwawang.toyProject.login.repository;

import com.woowangjwawang.toyProject.login.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long memberId){
        return em.find(Member.class, memberId);
    }

    public Member findByUsername(String username) throws NoResultException {
        return em.createQuery("select m from Member m where m.username = :username", Member.class)
                .setParameter("username", username)
                .getSingleResult(); //username은 unique제약을 걸어서 없거나 하나만 있거나
    }

    //회원 role 수정
    public Member setRole(Long memberId, String role) {
        Member member = em.find(Member.class, memberId);
        member.setRole(role);
        return member;
    }

}
