package com.qst.francis.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringToInteger {
	public Integer change(String str){
//		Pattern p = Pattern.compile("[0-9]+");
//		Matcher m = p.matcher(str);
//		if(m.matches()){
		if(str.matches("^-?[0-9]+$")){
			int ans = Integer.parseInt(str);
			return ans;
		}
		else{
			return null;
		}
	}
}
