class star_one {
	public static void main(String[] args) {
		int row=5;
		int space=0;
		for (int i=; ; ) {
			
		}




		space=8;
		for (int i=1;i<=row ;i++ ) { 
			for (int j=1;j<=i ;j++) {
				System.out.print(j);
			}
			for (int k=0;k<space ;k++ ) {
		 		System.out.print(" ");
		 	}
		 	for (int l=i;l>=1 ;l--) {
				System.out.print(l);
			}

		 	System.out.println(" ");
		 	space=space-2;
		}
	}
}