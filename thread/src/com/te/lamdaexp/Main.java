package com.te.lamdaexp;

public class Main {
	public static int sum(int i,int j) {
		return  i+j;
	}
	public int subtract(int i, int j) {
		System.out.println(i*j+"skldfjlsakdfjklajs");
		return i*j;
	}

	public static void main(String[] args) {
	Test	test = new Main()::subtract;
	test.add(20, 10);
	//System.out.println(test.add(4, 5));
	}
}
		
		
//		 Test test = new Test() {
			
//			@Override
//			public void message() {
//		    System.out.println("hello guys");
				
	//		}
//		};
//test.message();

//System.out.println("==================");

// Test test1=(i,j)->{           //ananomous classes
//	 System.out.println(i+j);
// };
 //test1.add(3, 5);
//	}

//}
//
