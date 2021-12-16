/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ghost
 */
public class newOptimized {
    //IDHP = Initial Disk Head Position
    int IHDP = 0;
    void insertionSortCylinders(int []arr){
        int  size  = arr.length ;
        for (int i = 1; i < size ; ++i) {
            int key = arr[i];
            int j = i -1 ;
            while(j>= 0 && arr[j]>key){
                arr[j+1]=arr[j];
                j = j-1 ;
            }
            arr[j+1]= key ;
        }
    }
    String [] optimizedAlgorithm(int [] arr ){
        String [] s = new String[arr.length+1] ;
        insertionSortCylinders(arr) ;
        for (int i = 0; i < arr.length+1; i++) {
            if (i ==0 ){
                s[i] = String.valueOf(IHDP);
            }
            else {
                s[i] = String.valueOf(arr[i-1]);
            }
        }
       return s ; 
    }
     String  totalMovement(int [] arr){
      int totalnumOfMove = 0 ;
      for (int i = 0; i < arr.length ; i++) {
          if (i == 0){
               totalnumOfMove += (arr[i]-IHDP);
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
