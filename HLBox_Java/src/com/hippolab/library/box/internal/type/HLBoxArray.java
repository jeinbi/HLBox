/*
 * Filename			: HLBoxArray.java
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

import java.util.ArrayList;

/**
 * 
 * @author HippoLab
 */
public final class HLBoxArray extends HLBoxDataType {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -3535199857617787170L;
	
	public HLBoxArray() {
		this.setArrayList(null);
	}
	
	public HLBoxArray(ArrayList<HLBoxDataType> arrayList) {
		this.setArrayList(arrayList);
	}
		
	public void setArrayList(ArrayList<HLBoxDataType> arrayList) {
		this.data = arrayList;
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<HLBoxDataType> getArrayList() {
		return (ArrayList<HLBoxDataType>) this.data;
	}

	@Override
	public String toString() {
		ArrayList<HLBoxDataType> arrayList = this.getArrayList();
		
		if (arrayList == null) {
			return HLBoxDataType.DESCRIPTION_NULL;
		} else {
			String desc = "";
			
			for (HLBoxDataType data : arrayList) {
				if (desc.length() != 0) {
					desc += ",";
				}
				
				desc += data.toString();
			}
			
			return "[" + desc + "]";
		}
	}
}
