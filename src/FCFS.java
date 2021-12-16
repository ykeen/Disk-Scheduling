/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghost
 */
public class FCFS {
//     System.out.print("cylinders I/O requests");
  String [] fcfsAlgorithm(String [] arr , String head){
      String [] fcfs = new String [arr.length+1] ;
      for (int i = 0; i < arr.length+1 ; i++) {
          if (i == 0) 
              fcfs[i] = head ;
          else
              fcfs[i] = arr[i-1] ;
      }
       return fcfs ;
      
    }
   String  totalMovement(int [] arr , int head){
      int totalnumOfMove = 0 ;
      for (int i = 0; i < arr.length ; i++) {
          if (i == 0){
               totalnumOfMove += (head- arr[i]);
          }
            
          else {
              if(arr[i]>arr[i-1]){
                  totalnumOfMove += (arr[i] - arr[i-1]) ;
              }
                  
              else 
                  {
                  totalnumOfMove += (arr[i-1] - arr[i]) ;
                  }
          }
              
      }
      String totalMove = String.valueOf(totalnumOfMove);
       
      return totalMove;
   }
    
}
