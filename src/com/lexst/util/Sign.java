/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright lexst.com, 2009, All rights reserved
 * 
 * hash encoder
 * 
 * @author scott.liang lexst@126.com
 * @version 1.0 5/8/2009
 * 
 * @see com.lexst.util
 * @license GNU Lesser General Public License (LGPL)
 */
package com.lexst.util;

public final class Sign {

	public static boolean loaded = false;

	/**
	 * to sign
	 * @param b
	 * @param off
	 * @param len
	 * @return
	 */
	public native static long sign(byte[] b, int off, int len);

	static {
		try {
			System.loadLibrary("lexstsg");
			Sign.loaded = true;
		} catch (UnsatisfiedLinkError exp) {
			exp.printStackTrace();
		} catch (SecurityException exp) {
			exp.printStackTrace();
		}
	}

}