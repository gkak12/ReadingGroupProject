package com.reading.group.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(
	schema="reading",
	name="meeting"
)
@SequenceGenerator(
	name="MEETING_SEQ_GENERATOR",
	sequenceName="MEETING_SEQ",
	initialValue=1 
)
public class Meeting {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEETING_SEQ_GENERATOR")
	@Column(name="id")
	private final int id;
	
	@Column(name="cnts_id")
	private String cntsId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date")
	private Date date;
	
	@Column(name="place")
	private String place;
	
	@Column(name="open_yn")
	private boolean open_yn;
	
	@Column(name="etc_issue")
	private String etcIssue;
}
