package com.prohk.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class MemberDto { // vo, dto, bean
	private int no;
	private String id;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String phoneFirst;
	private String phoneMiddle;
	private String phoneLast;
	private int zipCode;
	private String address;
	private String address01;
	private String address02;
	private String regDate;
	private String img;
	private String realImg;
	private String thumb;
}
