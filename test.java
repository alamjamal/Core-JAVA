class test{
	
	static{
		System.out.println("static block");
		System.out.println(test.a);
	}
	public static void main(String[] args) {
		System.out.println("main block");
		System.out.println(test.a);
	}

	static int a=100;
	
}
