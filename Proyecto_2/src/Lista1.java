import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Random;

public class Lista1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		  
		num.add(10);
		num.add(80);
		num.add(30);
		num.add(70);
  
        //recorido
        for (int i = 0; i < num.size(); i++) 
        {
           // Math.random()
            int lista = (int)(Math.random() * num.size());
            System.out.println(""+ num.get(lista));
        }
		// TODO Auto-generated method stub
		ArrayList<String> vocal;
		vocal = new ArrayList<String>();
		vocal.add("c");
		vocal.add("a");
		vocal.add("b");
		/*System.out.println(vocal.get(0));
		System.out.println(vocal.get(1));
		System.out.println(vocal.get(2));*/
		
		for(int i = 0; i < vocal.size(); i++) {
			 int lista = (int)(Math.random() * vocal.size());
				System.out.println("" + vocal.get(i));
		 } 
		Ordenadanum();
		Ordenadavocal();
	}	
	public static void Ordenadanum( ) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		  
		num.add(10);
		num.add(80);
		num.add(30);
		num.add(70);
		//ordenado
		Collections.sort(num);
       
        for (int i = 0; i < num.size(); i++) 
        {
          
            System.out.println(""+ num.get(i));
        }
	}
        public static void Ordenadavocal( ) {
        	ArrayList<String> vocal;
    		vocal = new ArrayList<String>();
    		vocal.add("c");
    		vocal.add("a");
    		vocal.add("b");
    		Collections.sort(vocal);
    		for(int i = 0; i < vocal.size(); i++) {
    				System.out.println("" + vocal.get(i));
    		 } 
        
		
	}
		
}
