package com.sb.app.model;

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
public class StudentVO {
	private String stNum;
	private String stName;
	private String stTel;
	private String stAddr;
	private String stDept;
	private int stGrade;
}
