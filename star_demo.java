class star_demo {
	public static void main(String[] args) {
		int row=5;
		int space=0;
		for (int i=1;i<=row ;i++) {
			for (int j=1;j<=i ;j++) {      //j=i;j<=row;j++ and j=row;j>=i;j--
				System.out.print(j);
			}
			System.out.println(" ");
		}

		System.out.println();
		for (int i=1;i<=row ;i++) {
			for (int j=i;j>=1;j--) {      
				System.out.print(j);
			}
			System.out.println(" ");
		}

		
		System.out.println();
		for (int i=1;i<=row ;i++) {
			for (int j=i;j<=row;j++) {      
				System.out.print(j);
			}
			System.out.println(" ");
		}

		System.out.println();
		for (int i=1;i<=row ;i++) {
			for (int j=row;j>=i;j--) {      
				System.out.print(j);
			}
			System.out.println(" ");
		}

		System.out.println();
		int count=0;
		row=4;
		for (int i=1;i<=row ;i++) {
			for (int j=1;j<=i ;j++) {      
				count++;
				System.out.print(count);
			}
			System.out.println(" ");
		}

		

	}
}