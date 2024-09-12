package com.reading.group.entity.id;

import java.io.Serializable;
import java.util.Objects;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class MemberToMeetingId implements Serializable {

	private static final long serialVersionUID = 1L;

	private final int memberId;
	
	private final int meetingId;
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		} else if(this.getClass() != obj.getClass()) {
			return false;
		}
		
		MemberToMeetingId tmpObj = (MemberToMeetingId) obj;
		boolean flag = Objects.equals(this.hashCode(), tmpObj.hashCode());
		return flag;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(memberId, meetingId);
	}
}
