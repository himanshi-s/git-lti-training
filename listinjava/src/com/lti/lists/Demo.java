package com.lti.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Integer arr[] = {10,15,7,8,4,34};

		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);
		    Collections.sort(list);
		    System.out.println(list);
	}
}
