package com.reading.group.repository.imp;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.reading.group.entity.Member;
import com.reading.group.entity.QMember;
import com.reading.group.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryImp implements MemberRepository{

	private static final Logger LOGGER = LoggerFactory.getLogger(MemberRepositoryImp.class);
	
	private final JPAQueryFactory queryFactory;
	
	private final EntityManager entityManager;
	
	@Override
	public List<Member> selectAllMember() throws Exception {
		QMember qMember = QMember.member;
		List<Member> list = queryFactory
								.select(qMember)
								.from(qMember)
								.fetch();
		
		return list;
	}
}
