package com.callor.ems.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserVO {
	@Size(min=5, max=12,message="username은 5~12글자까지 입니다.")
	private String username;
//	@Pattern(
//			regexp = "^.*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$",
//			message="비밀번호는 영문 숫자 특수문자 포함 8~15자리입니다"
//			)
	private String password;
	@Email(message="이메일을 정확히 입력해주세요")
	private String email;
	private String name;
	private String role;	
	
	private String key;
	private String key_ok;
}
