package com.reading.group.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(
	schema="reading",
	name="member"
)
@SequenceGenerator(
	name="MEMBER_SEQ_GENERATOR",
	sequenceName="MEMBER_SEQ",
	initialValue=1,
	allocationSize=1
)
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")
	@Column(name="id")
	private final int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="join_date")
	private Date joinDate;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="withdrawal_date")
	private Date withdrawalDate;
	
	@Column(name="etc_issue")
	private String etcIssue;
	
	@OneToMany(mappedBy="memberId")
	private List<MemberToMeeting> memberToMeetingList;
}
