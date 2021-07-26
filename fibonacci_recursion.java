 class fibonacci_recursion{
	static void fibrec(int num){
		int n1=0,n2=1,sum=0;
		if(num>0){
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			fibrec(num-1);
		}
		
	}

	public static void main(String[] args) {
		fibrec(5);
		}
}

