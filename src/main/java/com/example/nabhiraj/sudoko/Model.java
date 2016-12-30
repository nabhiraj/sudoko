package com.example.nabhiraj.sudoko;

import java.util.Vector;

/**
 * Created by nabhiraj on 10/9/2016.
 */
public class Model {
    //this is the logic class.
static    int data[][]={{9,0,3,0,0,0,0,0,8},{0,6,0,0,0,0,0,1,0},{0,5,0,2,0,0,0,9,0},{0,0,0,1,6,4,5,0,2},{0,0,0,0,3,0,0,0,0},{6,0,1,5,8,7,0,0,0},{0,4,0,0,0,6,0,8,0},{0,8,0,0,0,0,0,2,0},{2,0,0,0,0,0,3,0,7}};
    //now making the cher function.
     static public boolean Hiscommpleate(){
        for(int i=0;i<9;i++){
            int a[]={1,2,3,4,5,6,7,8,9};
            for(int j=0;j<9;j++){
               for(int k=0;k<9;k++){
                   if(data[i][j]==a[k]){
                       a[k]=0;
                   }

               }


            }
            for(int l=0;l<9;l++){
                if(a[l]!=0)
                    return false;

            }

        }

        return true;
    }


    public static boolean Viscommpleate(){
        for(int i=0;i<9;i++){
            int a[]={1,2,3,4,5,6,7,8,9};
            for(int j=0;j<9;j++){
                for(int k=0;k<9;k++){
                    if(data[j][i]==a[k]){
                        a[k]=0;
                    }
                }

            }
            for(int l=0;l<9;l++){
                if(a[l]!=0)
                    return false;
            }
        }
        return true;
    }
    //public boolean enter data
    public  static boolean enter(int r,int c,int dataa){
        data[r][c]=dataa;
        return (Viscommpleate()&&Hiscommpleate());
    }

    }

