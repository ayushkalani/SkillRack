package skillrack;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

class EightPuzzle {

    Scanner sc=new Scanner(System.in);
    
	Queue<String> nodes = new LinkedList<String>();    // Use of Queue Implemented using LinkedList for Storing All the Nodes in BFS.
    Map<String,Integer> stateDepth = new HashMap<String, Integer>(); // HashMap is used to ignore repeated nodes
    Map<String,String> stateHistory = new HashMap<String,String>(); // relates each position to its predecessor

    public static void main(String args[]){
    	 EightPuzzle e = new EightPuzzle(); 					// New Instance of the EightPuzzle
        System.out.println("Enter initial state");
        String str=e.sc.nextLine();								 // Input the Board State as a String with 0 as the Blank Space
    	 
        e.add(str, null);                                                   // Add the Initial State

        while(!e.nodes.isEmpty())
{            String currentState = e.nodes.remove();
            e.up(currentState);                                      
            e.down(currentState);                                    
            e.left(currentState);                                   
            e.right(currentState);                         
        }

        System.out.println("Solution doesn't exist");
    }

    
    //Add method to add the new string to the Map and Queue
    void add(String newState, String oldState){
        if(!stateDepth.containsKey(newState)){
            int newValue = oldState == null ? 0 : stateDepth.get(oldState) + 1;
            stateDepth.put(newState, newValue);
            nodes.add(newState);
            stateHistory.put(newState, oldState);
        }
    }

    
    
    
    
    void up(String currentState){
        int a = currentState.indexOf("0");
        if(a>2){
            String nextState = currentState.substring(0,a-3)+"0"+currentState.substring(a-2,a)+currentState.charAt(a-3)+currentState.substring(a+1);
            checkCompletion(currentState, nextState);
        }
    }

    void down(String currentState){
        int a = currentState.indexOf("0");
        if(a<6){
            String nextState = currentState.substring(0,a)+currentState.substring(a+3,a+4)+currentState.substring(a+1,a+3)+"0"+currentState.substring(a+4);
            checkCompletion(currentState, nextState);
        }
    }
    /*
      int a = currentState.indexOf("0");
        if(a>2){
            String nextState = currentState.substring(0,a-3)+"0"+currentState.substring(a-2,a)+currentState.charAt(a-3)+currentState.substring(a+1);
            checkCompletion(currentState, nextState);
            
     */
    void left(String currentState){
        int a = currentState.indexOf("0");
        if(a!=0 && a!=3 && a!=6){
            String nextState = currentState.substring(0,a-1)+"0"+currentState.charAt(a-1)+currentState.substring(a+1);
            checkCompletion(currentState, nextState);
        }
    }
    void right(String currentState){
        int a = currentState.indexOf("0");
        if(a!=2 && a!=5 && a!=8){
            String nextState = currentState.substring(0,a)+currentState.charAt(a+1)+"0"+currentState.substring(a+2);
            checkCompletion(currentState, nextState);
        }
    }

    private void checkCompletion(String oldState, String newState) {
    	//EightPuzzle e = new EightPuzzle(); 
    	
        add(newState, oldState);
        if(newState.equals("123456780")) {
            System.out.println("Solution Exists at level "+stateDepth.get(newState));
            String traceState = newState;
            while (traceState != null) {
                System.out.println("next Step "+ traceState + " at " + stateDepth.get(traceState));
                traceState = stateHistory.get(traceState);
            }
            System.exit(0);
        }
    }

}

