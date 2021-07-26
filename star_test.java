class star_test {
	public static void main(String[] args) {
		int row=6;
		for (int i=row;i>=1 ;i-- ) {
			for (int j=1;j<=i ;j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i=row;i>=1 ;i-- ) {
			for (int j=i;j>=1 ;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i=row;i>=1 ;i-- ) {
			for (int j=i;j<=row ;j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println();

		for (int i=row;i>=1 ;i-- ) {
			for (int j=row;j>=i ;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

		

	}
}