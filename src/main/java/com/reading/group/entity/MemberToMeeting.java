package com.reading.group.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.reading.group.entity.id.MemberToMeetingId;

import lombok.Data;

@Data
@Entity
@Table(
	schema="reading",
	name="member_to_meeting"
)
@IdClass(MemberToMeetingId.class)
public class MemberToMeeting {

	@Id
	@ManyToOne
	@JoinColumn(name="member_id")
	private final int memberId;
	
	@Id
	@ManyToOne
	@JoinColumn(name="meeting_id")
	private final int meetingId;
}
