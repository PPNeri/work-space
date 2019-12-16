package app;

import java.util.ArrayList;
//import java.util.Scanner;

public class Ex_06 {
    public static void main(final String[] args) throws Exception {
       
        
        
        int a[]={0,2,1,6,-8,-8,2,0,12,56,-1,0,0,100};

        
        
        
        
        IntToBoolean(a);
        
        
        
    }
    
    
    
    public static void IntToBoolean( int array[]) {
        ArrayList<Boolean> booList=new ArrayList<>();
               
        
        for ( int elemento:array){
            if (elemento>0){
                booList.add(true);
            }else{
                booList.add(false);
            }
        }
        System.out.print("Numeros são:");
        for(int elementos:array){
            System.out.print("     "+elementos);
        }
        System.out.print("\n");
        System.out.println("Boleanos são :"+booList);

       
    
        }
    }