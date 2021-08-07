package snippet;

public class ForTesting {
	static String dummy = "piika";
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring(dummy));
	}
    public static int lengthOfLongestSubstring(String s) {
        int max = 1;
        int temp = 0;
        int start = 0;
        char [] word = new char[s.length()];
        //char [] dupl = new char[s.length()];
            for(int i = 0; i<s.length();i++){
                word[i] = s.charAt(i);//this puts the string in a character array
            }
            for(int i = 0; i<word.length;i++) {
    			System.out.println("This is i " + word[i] + " " + i);
            	for(int y = i-1; y>=start; y--) {
            		temp++;
    				System.out.println("This is temp " + temp);
        			System.out.println("This is Y " + word[y] + " " + y);
        			if(max < temp) {
        				max = temp;
        			}
            		if(word[y] == word[i]) { //this will always be true, when it shouldn't be
            			start = i;
            			System.out.println("This is start " + start);
            		}
            	}
            	temp = 0;
            }
	        if(s.equals(" ")) {
	        	max = 1;
	        }
	        if(s.equals("")) {
	        	max = 0;
	        }
        return max;
    }
	}