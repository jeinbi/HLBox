/*
 * Filename			: HLBoxDataType.java
 * Creation date	: 2012.05.31
 * Creator			: HippoLab
 * Comments			: Definition and implementation of class HLBoxDataType
 * 
 * Revision date	:
 * By				:
 * Revisions		: 
 * 
 * Copyright (c) 2012 HippoLab. All rights reserved.
 */

package com.hippolab.library.box.internal.type;

import java.io.Serializable;

/**
 * The abstract class <code>HLBoxDataType</code> is the superclass of classes
 * that represent various data types of HLBox.
 * <p>
 * This abstract class is for internal class, so it must be only used in HLBox
 * library.
 * 
 * @author HippoLab
 * @see     com.hippolab.library.box.internal.type.HLBoxString
 * @see     com.hippolab.library.box.internal.type.HLBoxNumber
 * @since   1.0
 */
public abstract class HLBoxDataType implements Serializable {
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 3662915736900404796L;

	/**
	 * This string is to write a null value at <code>toString</code> method.
	 */
	public static final String DESCRIPTION_NULL = "(null)";
	
	/**
	 * All data of HLBox is allocated to this object.
	 */
	protected Object data;

	@Override
	public int hashCode() {
		return this.data.hashCode();
	}

	@Override
	public boolean equals(Object anObject) {
		return this.data.equals(anObject);
	}
	
	@Override
	public abstract String toString();
} 
