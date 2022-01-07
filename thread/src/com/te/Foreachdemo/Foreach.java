package com.te.Foreachdemo;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;






public class Foreach {

	public static void main(String[] args) {
	List<Integer> arrayList  =	Arrays.asList(1,18,45,3,6,99,67,55);
	arrayList.forEach(System.out::println);
	for(int i =1;i<arrayList.size();i++) {
		System.out.println(arrayList.get(i));
	}
	for(Integer i : arrayList) {
		System.out.println(i);
	}
	Iterator<Integer> iterator = arrayList.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}

	}

}
