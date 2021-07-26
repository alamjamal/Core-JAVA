class static_block_order {
	static {
		System.out.println("static block start");
		System.out.println(static_block_order.a);
		System.out.println("static block end");
	}
	public static void main(String[] args) {
		System.out.println(static_block_order.a);
		static_block_order.fun();
		System.out.println(static_block_order.a);
	}
	static int a=100;
	static void fun(){
		System.out.println("static function start");
		static_block_order.a=static_block_order.a+50;
		System.out.println("static function end ");
	}
}