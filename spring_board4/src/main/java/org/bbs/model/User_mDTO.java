package org.bbs.model;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class User_mDTO {
	private int mno;
	private String mname;
	private String mphone;
	private String maddr;
	private int mage;
	private String mgender;
	private String mregdate;
}
