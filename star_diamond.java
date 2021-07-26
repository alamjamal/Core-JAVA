class star_diamond  {
	public static void main(String[] args) {
		 int space=0;
		 int n=5;
		 for (int i=n;i>=1 ;i-- ) {
		 	for (int j=1;j<=i ;j++ ) {
		 		System.out.print(j);
		 	}
		 	for (int k=0;k<space ;k++ ) {
		 		System.out.print(" ");
		 	}
		 	for (int l=i;l>=1 ;l-- ) {
		 		System.out.print(l);
		 	}
		 	System.out.println(" ");
		 	space=space+2;
		 }
		 space=2*n-4;

		 for (int i=2;i<=n ;i++) {
		 	for (int j=1;j<=i ;j++ ) {
		 		System.out.print(j);
		 	}
		 	for (int k=0;k<space ;k++ ) {
		 		System.out.print(" ");
		 	}
		 	for (int l=i;l>=1 ;l-- ) {
		 		System.out.print(l);
		 	}
		 	System.out.println(" ");
		 	space=space-2;
		 }
	}
}