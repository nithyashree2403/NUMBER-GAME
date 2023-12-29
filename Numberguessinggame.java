import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame{

   public static void main(String[] args) { 
	    Random rand=new Random();
	    Scanner scanner=new Scanner(System.in);
	    System.out.println("welcome to Number Game\n*****INSTRUCTION*****\nyou will be given 4 chances to guess \ntotal points is 100 \nfor wrong guess in each chance your score wll get reduced by 10\n ");
	    char n='y';
	    
	    while(n=='y'){
	        int tc=0;
	        int randomnumber=rand.nextInt(100)+1;
	        System.out.println(randomnumber);
	        int s=3;
    	    while(s>=0){
        	    System.out.println("enter a value between (1-100):");
        	    
        	    int playerguess=scanner.nextInt();
        	    tc++;
        	    if(playerguess==randomnumber){
        	        System.out.println("\ncorrect!,keep it up\n** YOU WON **");
        	        System.out.println("trial count:"+tc+" "+"score:"+(110-tc*10));
        	        break;
        	        }
        	       
        	       
        	        
        	    
        	    else if(randomnumber<playerguess){
        	        
        	        System.out.println("ops!the number is higher");
        	   
        	        }
        	    else{
        	       
        	        System.out.println("ops!the number is lower");
    	    }
    	    s--;
    	    if(s==-1){
    	        System.out.println("\nthe correct value is:"+randomnumber+"\n** YOU LOST **");
    	        
    	        
    	    }
    	     
    	}
    	System.out.println("\n**************************************************************\n");
    	 
    	 System.out.println("if u want to replay type y or type n");
        	        n=scanner.next().charAt(0);
        	        if (n=='n'){
        	            break;
    }
    }
}}