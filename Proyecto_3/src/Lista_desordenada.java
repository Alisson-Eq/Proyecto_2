import java.util.ArrayList;
import java.util.Collections;


public class Lista_desordenada {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		  
		num.add(2);
		num.add(5);
		num.add(3);
		num.add(4);
  
      
        for (int i = 0; i < num.size(); i++) 
        {
            int lista = (int)(Math.random() * num.size());
            System.out.println(""+ num.get(lista));
        }
		
        
		ArrayList<String> vocal;
		vocal = new ArrayList<String>();
		vocal.add("f");
		vocal.add("i");
		vocal.add("h");
		
		
		for(int i = 0; i < vocal.size(); i++) {
			 int lista = (int)(Math.random() * vocal.size());
				System.out.println("" + vocal.get(i));
		 } 
		Desordenadanum();
		Desordenadavocal();
	}	
	public static void Desordenadanum( ) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		  
		num.add(2);
		num.add(5);
		num.add(3);
		num.add(4);
		//desordenado
		Collections.reverse(num);
       
        for (int i = 0; i < num.size(); i++) 
        {
          
            System.out.println(""+ num.get(i));
        }
	}
        public static void Desordenadavocal( ) {
        	ArrayList<String> vocal;
    		vocal = new ArrayList<String>();
    		vocal.add("f");
    		vocal.add("i");
    		vocal.add("h");
    		Collections.reverse(vocal);
    		for(int i = 0; i < vocal.size(); i++) {
    				System.out.println("" + vocal.get(i));
    		 } 
        
	}

}
