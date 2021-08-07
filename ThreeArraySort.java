package PracticeProblems;
import java.util.*;

/*
 We are going to sort all three arrays. To do that, we need to sort the prices first, and the other two
 will follow suit. This is because only the prices can be sorted in a way introducing the least amount
 of logic.
 
 All three arrays are split and merged at the same time. Price is the only one that has comparisions. The other two arrays are put merged as the prices are. 
 */

/*
S01 T02 T01
150 300 300
55   1   50

Result
T01 T02 S01
300 150 300
1   55   50


S01 S03 S02
300 300 150
1	 0    1

Result
T01 S01 T02
300 300 150
1    0    1
 */
public class ThreeArraySort {
	static String[] models = {"S01", "S03", "S02"};
	static int[] prices = {300, 300, 150};
	static int[] sizes = {1, 0, 1};
	
	//this needs to be in a main class or else eclipse will think you are making new class
	public static void main(String[] args){
		solution(models, prices, sizes);
	}
	
 public static String[] solution(String[] M, int[] P, int[] S) {
     // write your code in Java SE 8
     
		Sort(P, S, M, P.length);

		System.out.println("This is the final array");
			for(int w = 0; w < P.length; w++){
			System.out.println(M[w]);
			}
 return M;
 }

 //this method halves the arrays until they are in pair or by themselves via recursion. Then it invokes the merge
 //method to sort and merge them together.
 public static void Sort(int[] mainprice, int[] mainsize, String[] mainmodel, int arraysize){
     if (arraysize < 2) {
         return;
     }
     int swapindex = 0;
     int half = arraysize/2;
     int[] firsthalfP = new int [half];
     int[] secondhalfP = new int [arraysize-half];
     int[] firsthalfS = new int [half];
     int[] secondhalfS = new int [arraysize-half];
     String[] firsthalfM = new String [half];
     String[] secondhalfM = new String [arraysize-half];
     
     for(int i = 0; i < half; i++) {
    	 firsthalfP[i] = mainprice[i];
     }
     
     for(int i = half; i < arraysize; i++) {
    	 secondhalfP[i - half] = mainprice[i];
     }
     

     for(int i = 0; i < half; i++) {
    	 firsthalfS[i] = mainsize[i];
     }
     
     for(int i = half; i < arraysize; i++) {
    	 secondhalfS[i - half] = mainsize[i];
     }
     
     
     for(int i = 0; i < half; i++) {
    	 firsthalfM[i] = mainmodel[i];
     }
     
     for(int i = half; i < arraysize; i++){
    	 secondhalfM[i - half] = mainmodel[i];
     }
     /*
     we have an issue here where all the half arrays need to use the recursive Sort.
     */
     
     Sort(firsthalfP, firsthalfS, firsthalfM, half);
     Sort(secondhalfP, secondhalfS, secondhalfM, arraysize-half);
     merge(mainprice,firsthalfP, secondhalfP, mainsize, firsthalfS, secondhalfS, mainmodel, firsthalfM, secondhalfM, half, arraysize-half);
     
      for(int i = 0; i < mainprice.length-1; i++){
      	if(mainprice[i] == mainprice[i+1]){
      		if(mainmodel[i].indexOf("S") != -1){
      			System.out.println("Pikachu");
      		}
      		else{
      			System.out.println("Pichu");

      		}
      	}
      }
     
      
 }

 //this array sorts and puts together all the elements of an array after the sort methods are done.
 public static int[] merge(int[] allprices, int[] firstprice, int[] lastprice, int[] allsizes, 
 int[] firstsizes, int[] lastsizes, String[] allmodels, String[] firstmodels, String[] lastmodels, 
 int mid, int length){
	 int firstcounter = 0;
	 int lastcounter = 0;
	 int allcounter = 0;
     
	 while(firstcounter < mid && lastcounter < length) {
		 if(firstprice[firstcounter] < lastprice[lastcounter]) {
			 allprices[allcounter] = firstprice[firstcounter];
			 allsizes[allcounter] = firstsizes[firstcounter];
			 allmodels[allcounter] = firstmodels[firstcounter];
			 allcounter++;
			 firstcounter++;
		 }
		 else {
			 allprices[allcounter] = lastprice[lastcounter];
			 allsizes[allcounter] = lastsizes[lastcounter];
			 allmodels[allcounter] = lastmodels[lastcounter];
			 allcounter++;
			 lastcounter++; 
		 }
	 }
	 while (firstcounter < mid) {
		 allprices[allcounter] = firstprice[firstcounter];
		 allsizes[allcounter] = firstsizes[firstcounter];
		 allmodels[allcounter] = firstmodels[firstcounter];
		 allcounter++;
		 firstcounter++;
	 }
	 while (lastcounter < length) {
		 allprices[allcounter] = lastprice[lastcounter];
		 allsizes[allcounter] = lastsizes[lastcounter];
		 allmodels[allcounter] = lastmodels[lastcounter];
		 allcounter++;
		 lastcounter++;
	 }
	 return allprices;
 }
}

