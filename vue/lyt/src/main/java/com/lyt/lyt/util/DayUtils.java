package com.lyt.lyt.util;//package cn.ty.util;
//
//import java.util.Calendar;
//
//public class DayUtils {
//
//	/**
//	 * 求输入相应的年月日，输出对应的多少天 采用日期类的 Calendar形式
//	 *
//	 * @param year
//	 *            年
//	 * @param month
//	 *            月
//	 * @param date
//	 *            ---day 日
//	 */
//	public static void getDay_Calendar(int year, int month, int date) {
//		if (year < 1) {
//			return;
//		}
//		if (month < 1 || month > 12) {
//			return;
//		}
//		if (date < 1 || date > 31) {
//			return;
//		}
//		// 1、创建实例
//		Calendar calendar = Calendar.getInstance();
//
//		// 设置时间 month月 对应的 0-11
//		calendar.set(year, month - 1, date);
//
//		// 3、得到对应的第几天
//		int sumDays = calendar.get(Calendar.DAY_OF_YEAR);
//
//		System.out.println(year + "年" + month + "月" + date + "日是今年的第 " + sumDays + " 天！");
//	}
//
//
//	/**
//     * 求输入相应的年月日，输出对应的多少天
//     *       采用数组的形式
//     * @param year 年
//     * @param month 月
//     * @param day 日
//     */
//    public static void getDay_array(int year,int month,int date){
//    	if (year < 1) {
//			return;
//		}
//		if (month < 1 || month > 12) {
//			return;
//		}
//		if (date < 1 || date > 31) {
//			return;
//		}
//        //1、定义相关的变量
//        int sumDays=0;//对应的总天数
//        int[] monthDay={0,31,28,31,30,31,30,31,31,30,31,30};//对应月份的天数
//
//        //2、判断是否为闰年并且月份大于2   若是2月份为29天
//        if((year%4==0&&year%100!=0||year%400==0)&&month>2){
//            monthDay[2]=29;//将闰年的二月份多出的一天加上
//        }
//
//        //3、根据月份计算天数
//        for (int i = 0; i < month; i++) {
//            sumDays+=monthDay[i];
//        }
//
//        //4、加上当月对应的天数
//                sumDays+=date;
//                System.out.println(year+"年"
//                                    +month+"月"
//                                    +date+"日是今年的第 "
//                                    +sumDays+" 天！");
//
//    }
//
//
//    /**
//     * 求输入相应的年月日，输出对应的多少天
//     *      采用switch case形式
//     * @param year 年
//     * @param month 月
//     * @param day 日
//     */
//    public static void getDay_switchCase(int year,int month,int day){
//        //1、定义相关的变量
//        int sumDays=0;//对应的总天数
//
//        //2、判断是否为闰年并且月份大于2   若是总天数多一天
//        if((year%4==0&&year%100!=0||year%400==0)&&month>2){
//            sumDays=1;//将闰年的二月份多出的一天加上
//        }
//
//        //3、加上之前几个月的天数
//        for(int i=1;i<month;i++){
//            switch(i){
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//            case 8:
//            case 10:
////          case 12:
//                    sumDays+=31;
//                    break;
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                    sumDays+=30;
//                    break;
//            case 2:sumDays+=28;
//            }
//        }
//
//        //4、加上当月对应的天数
//        sumDays+=day;
//        System.out.println(year+"年"
//                            +month+"月"
//                            +day+"日是今年的第 "
//                            +sumDays+" 天！");
//    }
//
//}
