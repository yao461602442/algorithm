package OJ;

import java.util.*;
//汽车加油
public class E1213{
      public static void main(String[] args)
      {
              Scanner input = new Scanner(System.in);
              int move = input.nextInt();
              int length = input.nextInt(); 
              int[] distance = new int[length+1]; //油站之间的距离
              int time = 0;

              for(int i=0; i<distance.length; ++i)
              {
                  distance[i] = input.nextInt();
                  if(distance[i] > move){
                	  System.out.println("No Solution!");
                	  System.exit(0);
                  }
              }
              
              for(int i=0,s=0; i<distance.length; ++i)
              {
            	  s+=distance[i];
            	  if(s>move)
            	  {
            		  s=distance[i];
            		  time++;
            	  }
              }
             
              
              System.out.println(time);
              input.close();
      }
}

