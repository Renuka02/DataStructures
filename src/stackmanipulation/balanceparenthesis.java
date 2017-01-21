package stackmanipulation;

import java.util.Scanner;
import java.util.*;

public class balanceparenthesis {
	
	public static void main(String args[]){
		System.out.println("Enter your input");
		String sc= new Scanner(System.in).nextLine();
		
		 
		
		System.out.println(balancestack(sc));
					
	}
	static boolean balancestack(String s){
		Stack<Character> mystack=new Stack<Character>();
		char a='[';
		char b='{';
		char c='(';
		char d=']';
		char e='}';
		char f=')';
		for (int i=0;i<s.length(); i++){
			if(s.charAt(i)=='[' ){
				mystack.push(a);
				
			}
			else 
				if(s.charAt(i)=='{' ){
					mystack.push(b);
				
			}
			else 
					if(s.charAt(i)=='(' ){
						mystack.push(c);
			
		}
					else if(s.charAt(i)==']'){
						
					if(mystack.isEmpty()){
						return false;
					}
					else if(mystack.peek()=='['){
						mystack.pop();
					}
					else{
						return false;
					}}
					else if(s.charAt(i)=='}'){
						if(mystack.isEmpty()){
							return false;
						}
						else if(mystack.peek()=='{'){
							mystack.pop();
						}
						else {
							return false;
						}}
						else if(s.charAt(i)==')'){
							if(mystack.isEmpty()){
								return false;
							}
							else if(mystack.peek()=='('){
								mystack.pop();
							}
							else {
								return false;
							}
					
					}
						
					}
		return mystack.isEmpty();
						
					}
	}


