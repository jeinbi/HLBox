/*
 * Filename			: HLBoxBoolean.java
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
public final class HLBoxBoolean extends HLBoxDataType {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 6379069958431950925L;
	
	public HLBoxBoolean() {
		this.setBoolean(null);
	}
	
	public HLBoxBoolean(Boolean bool) {
		this.setBoolean(bool);
	}
	
	public void setBoolean(Boolean bool) {
		this.data = bool;
	}
	
	public Boolean getBoolean() {  
		return (Boolean) this.data;
	}
	
	@Override
	public String toString() {
		return String.valueOf(this.getBoolean().booleanValue());
	}
}
