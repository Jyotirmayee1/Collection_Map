package OneNote;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Wjp1 {
	public static Map<Integer,Integer> addInput(int []inputArr){
		 Map<Integer,Integer>result=new HashMap<>();
		 for(int i=0;i<inputArr.length;i++) {
			 int currentVal=inputArr[i];
			 int sum=0;
			 for(int j=0;j<inputArr.length;j++) {
				 while(currentVal>0) {
					 int rem=currentVal%10;
					 sum=sum+rem;
					 currentVal=currentVal/10;
				 }
				 result.put(inputArr[i] , sum);
			 }
			 
		 }
		
		
		return result;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Q2. WJP to reverse the given numbers and addition of those number 
            Input: 111, 213, 333, 231, 112 
            Output: 111:3, 213:6, 333:9 likewise*/
        int inputArr []= {111, 213, 333, 231, 112};
         //Arrays.sort(inputArr);
        Map<Integer, Integer>result;
        result=addInput(inputArr);
        Iterator<Entry<Integer,Integer>> it= result.entrySet().iterator();
        while(it.hasNext()) {
        	Map.Entry entry=(Entry) it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        
	}

}
