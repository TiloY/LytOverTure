package com.lyt.lyt.util;//package cn.ty.util;
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
///**
// * 字符逆序
// * @author Administrator
// *
// */
//public class MyReverse {
//	public static void main(String[] args) {
//		System.out.println("请输入一个字符串:");
//		Scanner sc = new Scanner(System.in);
//     	String str = sc.nextLine();
//	    //StringBuilder sb = new StringBuilder(str);
//		//StringBuilder reverse = sb.reverse();
////		String myRe = myRe(str);
////		System.out.println(myRe.toString());
//     	defTup(str);
//		sc.close();
//	}
//	/**
//	 * 字符反转
//	 * @param input
//	 * @return
//	 */
//	public static String myRe(String input) {
//		String outPut = "" ;
//		char[] array = input.toCharArray();
//		for (int i = 0;i< array.length;i++) {
//			outPut += String.valueOf((array[array.length-(i+1)]));
//		}
//		return outPut.toString();
//	}
//
//	/**
//	 * 输出大写
//	 * @param input
//	 * @return
//	 */
//	//	Pattern compile = Pattern.compile("^[-\\+]?[\\d]*$"); // 数字 compile.matcher(cc).matches()
//	public static String defTup(String input) {
//		String outPut = "";
//		char[] charArray = input.toCharArray();
//		for (char c : charArray) {
//			String cc = String.valueOf(c);
//			if(Character.isUpperCase(c)) {
//				outPut += c;
//			}
//		}
//		System.out.println(outPut);
//		return outPut;
//	}
//	/**
//	 * 空格分割;跳过" "
//	 * @param input
//	 * @return
//	 */
//	public static String mySplit(String input) {
//		String outPut = "";
//		char[] array = input.toCharArray();
//		for(int i = 0; i < array.length ; i++) {
//			if(!Character.isSpace(array[i])) {
//				outPut += array[i];
//			}
//		}
//		return outPut ;
//	}
//
//}
