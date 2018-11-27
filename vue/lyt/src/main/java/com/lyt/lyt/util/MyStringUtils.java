package com.lyt.lyt.util;//package cn.ty.util;
//
//public class MyStringUtils {
//
//	// 求解两个字符号的最长公共子串
//	public static String maxSubstring(String strOne, String strTwo) {
//		// 参数检查
//		if (strOne == null || strTwo == null) {
//			return null;
//		}
//		if (strOne.equals("") || strTwo.equals("")) {
//			return null;
//		}
//		String max, min;
//		max = strOne.length() > strTwo.length() ? strOne : strTwo;
//		min = max.equals(strOne) ? strTwo : strOne;
//		String current = "";
//		// 遍历较短的字符串，并依次减少短字符串的字符数量，判断长字符是否包含该子串
//		for (int i = 0; i < min.length(); i++) {
//			for (int begin = 0, end = min.length() - i; end <= min.length(); begin++, end++) {
//				current = min.substring(begin, end);
//				if (max.contains(current)) {
//					return current;
//				}
//			}
//		}
//		return null;
//	}
//
//}
