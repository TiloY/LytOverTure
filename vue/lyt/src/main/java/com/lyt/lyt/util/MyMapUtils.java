package com.lyt.lyt.util;//package cn.ty.util;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Map.Entry;
//
//public class MyMapUtils {
//
//	public static void main(String[] args) {
//		int []arr = {1,1,2,1,0};
//		int n = 5;
//		getValue(arr,n);
//		//getValue2(arr,n);
//		//getValue3(arr,n);
//	}
//
//	private static int getValue(int[] arr, int n) {
//		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//		for(int i : arr) {
//			if(map.containsKey(i)) {
//				map.put(i, map.get(i)+1);
//			}else {
//				map.put(i, 1);
//			}
//		}
//		Integer temp = 0  ;
//		Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//			Entry<Integer, Integer> next = it.next();
//			if(next.getValue() > n/2) {
//				temp = next.getKey();
//			}
//		}
//		System.out.println(temp);
//		return temp;
//	}
//
//	 /* 1.排序数组，从小到大
//	    2.如果存在一个红包金额出现的次数超过红包总数的一半，必然排在中间
//	    3.遍历整个数组，统计中间元素出现的次数是否大于n/2
//        * @param gifts
//        * @param n
//        * @return*/
//	   public static int getValue2(int[] gifts, int n) {
//		 Arrays.sort(gifts);
//	     int result = gifts[n / 2];
//	     int count = 0;
//	     for(int i = 0 ; i < n ; i++){
//	      if(result == gifts[i]){
//	       count++;
//	      }
//	     }
//	     return count > n / 2 ? result : 0;
//  }
//
//	   private static int getValue3(int[] arr, int n) {
//			Map<Integer,Integer> map = new HashMap<Integer,Integer>();
//			for(int i : arr) {
//				map.put(i, 0);
//			}
//			for(int i : arr) {
//				if(map.containsKey(i)) {
//					map.put(i, map.get(i)+1);
//				}
//			}
//			List<Entry<Integer,Integer>> list = new ArrayList(map.entrySet());
//		    Collections.sort(list, (o1, o2) -> (o1.getValue() - o2.getValue()));
//		    int key =list.get(list.size()-1).getValue() > arr.length/2 ? list.get(list.size()-1).getKey() :0;
//		    System.out.println(key);
//		    return key;
//		}
//
//
//}
