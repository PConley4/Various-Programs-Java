package snippet;

class Overloadingpractice1 {
	
	public static void main(String[] args) {
		Questionaire(true);
		Questionaire(true,false);
		Questionaire(true,false,false);
	}

	public static boolean[] Questionaire(boolean first) {
		boolean[] form = new boolean[1];
		form[0] =first;
		System.out.println(form[0]);
		return form;
	}
	
	public static boolean[] Questionaire(boolean first, boolean second) {
		boolean[] form = new boolean[2];
		form[0] = first;
		form[1] = second;
		for (int i=0; i<form.length;i++){
		System.out.println(form[i]);
		}
		return form;
	}
	
	public static boolean[] Questionaire(boolean first, boolean second, boolean third) {
		boolean[] form = new boolean[3];
		form[0] = first;
		form[1] = second;
		form[2] = third;
		for (int i=0; i<form.length;i++){
		System.out.println(form[i]);
		}
		return form;
	}
}
