package PracticeProblems;

import java.util.Arrays;

public class NewMergesort {

	public static void main(String[] args) {
		int[] A = {5534,745,897,23,5};
		
		Sort(A, A.length);

		System.out.println("This is the final array");
			for(int w = 0; w < A.length; w++){
			System.out.println(A[w]);
			}
			
	}
	public static void Sort(int[] original, int size){
		if(size < 2) {
			return;
		}
		int half = size/2;
		int[] firsthalf = new int [half];
		int[] secondhalf = new int [size-half];
		
		for(int i = 0; i < half; i++) {
			firsthalf[i] = original[i];
		}

		for(int i = half; i < size; i++) {
			secondhalf[i - half] = original[i];
		}
		Sort(firsthalf,half);
		Sort(secondhalf,size-half);
		/*
		for(int w = 0; w < firsthalf.length; w++){
			System.out.println(firsthalf[w]);
		}
		*/
		//for(int w = 0; w < secondhalf.length; w++){
		//	System.out.println(secondhalf[w]);
		//}
		
		merge(original,firsthalf,secondhalf,half,size-half);
	}

	public static int[] merge (int[] all, int [] firsth, int[] lasth, int mid, int length) {
		//Arrays.sort(firsth);
		//Arrays.sort(lasth);
		int firstcounter = 0;
		int lastcounter = 0;
		int allcounter = 0;
		
		while(firstcounter < mid && lastcounter < length) {
			if(firsth[firstcounter] < lasth[lastcounter]) {
				all[allcounter] = firsth[firstcounter];
				allcounter++;
				firstcounter++;
			}
			else{
				all[allcounter] = lasth[lastcounter];
				allcounter++;
				lastcounter++;
			}
		}
	    while (firstcounter < mid) {
			all[allcounter] = firsth[firstcounter];
			allcounter++;
			firstcounter++;
	    }
	    
	    while (lastcounter < length) {
			all[allcounter] = lasth[lastcounter];
			allcounter++;
			lastcounter++;
	    }
		return all;
	}
	}

