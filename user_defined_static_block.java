
class user_defined_static_block{
	static void fun(){
		System.out.println("in user defined block");
	}
	public static void main(String[] args) {
		System.out.println("in  main block");
		user_defined_static_block.fun();
	}

}

