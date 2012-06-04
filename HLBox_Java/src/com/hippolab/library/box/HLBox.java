/*
 * Filename			: HLBox.java
 * Creation date	: 2012.06.03
 * Creator			: HippoLab
 * Comments			:
 * 
 * Revision date	:
 * By				:
 * Revisions		: 
 * 
 * Copyright (c) 2012 HippoLab. All rights reserved.
 */

package com.hippolab.library.box;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.hippolab.library.box.internal.type.HLBoxDataType;
import com.hippolab.library.box.internal.type.HLBoxString;

/**
 * 
 * @author HippoLab
 */
public final class HLBox implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -2935927431807043814L;
	
	private Map<String, HLBoxDataType> dataMap;
	
	public HLBox() {
		dataMap = new HashMap<String, HLBoxDataType>();
	}
	
	public void setStringData(String key, String strData) {
		HLBoxString data = new HLBoxString();
		data.setString(strData);
			
		dataMap.put(key, data);
	}
}
