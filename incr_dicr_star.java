class incr_dicr_star {
	public static void main(String[] args) {
		
		int row=5;
		int space=8;
		for (int i=1;i<=row ;i++ ) {
			for (int j=1;j<=i ;j++) {
				System.out.print(j);
			}
			
			for (int k=space;k>=1 ;k-- ) {
				System.out.print(" ");
			}

			for (int l=i;l>=1 ;l-- ) {
				System.out.print(l);
			}
			space=space-2;
			System.out.println("");
		}
		
	}
}