package OneNote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Pairofshoes_hackerrank {
	public static boolean pairofshoes(int [][]shoes) {
		
		Map<Integer,Integer> shoeMap = new HashMap<>();
		
		int l=shoes.length;
	    //check the length is even
		if(l%2!=0) {
			System.out.println("Missing pair");
			return false;
		}
		boolean shoePairFound=true;
		
		for (int i=0;i<shoes.length;i++)
		{
			
		if(shoeMap.containsKey(shoes[i][1])) {
		Integer shoeLeg=shoeMap.get(shoes[i][1]);
		//System.out.println("shoeleg:"+shoeLeg+", shoes[i][0]:"+shoes[i][0]);
		
		if(shoeLeg != null && shoeLeg.equals(shoes[i][0]))
		shoePairFound=false;
		}
		else
		{shoeMap.put(shoes[i][0],shoes[i][1]);}
			 }
		
		System.out.println("Pair found:"+shoePairFound);
	
	
	return shoePairFound;}

	public static void main(String[] args) {
		
		int[] [] shoes = {{0,21},{0,22},{1,67}};
		System.out.println(pairofshoes(shoes));
	}

}
