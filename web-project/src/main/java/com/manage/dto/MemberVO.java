package com.manage.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {
	private String name;
	private String userid;
	private String pwd;
	private String phone;
	private int gender;
	private int admin;
}
