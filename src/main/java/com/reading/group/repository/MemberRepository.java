package com.reading.group.repository;

import java.util.List;

import com.reading.group.entity.Member;

public interface MemberRepository {

	public List<Member> selectAllMember() throws Exception;
}
