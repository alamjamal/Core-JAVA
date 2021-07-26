class stack_application {
	public static void main(String[] args) {
		char ch[]={'{','a','{','b','}','}','}'};
		String str=new String(ch);
		int count=0;
		for (int i=0;i<str.length(); i++) {

			System.out.println(ch[i]);
			if (ch[i]=='{') {
				count++;
			}
			if (ch[i]=='}') {
				count--;
			}
			
		}
		if(count==0){
			System.out.println("perfect match");
		}
		else{
			System.out.println("not match ");
		}
	}
}



