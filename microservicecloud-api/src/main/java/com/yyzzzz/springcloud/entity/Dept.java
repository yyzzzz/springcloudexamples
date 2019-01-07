package com.yyzzzz.springcloud.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8592771853652075463L;
	private Long deptNo;
    private String deptName;
    private String dbSource;
	
}
