/*
 * Filename			: HLBoxNumber.java
 * Creation date	: 2012.06.02
 * Creator			: HippoLab
 * Comments			:
 * 
 * Revision date	:
 * By				:
 * Revisions		: 
 * 
 * Copyright (c) 2012 HippoLab. All rights reserved.
 */

package com.hippolab.library.box.internal.type;

/**
 * 
 * @author HippoLab
 */
public final class HLBoxNumber extends HLBoxDataType {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5026736888584744203L;

	public HLBoxNumber() {
		this.setNumber(null);
	}
	
	public HLBoxNumber(Number num) {
		this.setNumber(num);
	}
	
	public void setNumber(Number num) {
		this.data = num;
	}
	
	public Number getNumber() {
		return (Number) this.data;
	}
		
	@Override
	public String toString() {
		Number num = this.getNumber();
		return (num != null) ? String.valueOf(num) : HLBoxDataType.DESCRIPTION_NULL;
	}
}
