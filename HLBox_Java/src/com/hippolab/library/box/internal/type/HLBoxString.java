/*
 * Filename			: HLBoxString.java
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
public final class HLBoxString extends HLBoxDataType {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4944193046457218235L;
	

	public HLBoxString() {
		this.setString(null);
	}
	
	public HLBoxString(String str) {
		this.setString(str);
	}
	
	public void setString(String str) {
		this.data = str;
	}
	
	public String getString() {
		return (String) this.data;
	}
	
	@Override
	public String toString() {
		String str = this.getString();
		return (str != null) ? "\"" + str + "\"" : HLBoxDataType.DESCRIPTION_NULL;
	}
}
