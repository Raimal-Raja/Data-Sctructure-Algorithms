public class Add_Matrix{  
    public static void main(String args[]){  
       
    int a[][] = { { 2, 1, 9 }, { 4, 2, 4 }, { 0, -6, 2 } };
    int b[][] = { { 9, 1, 5 }, { 2, 1, 8 }, { 11, 4, 3 } };    
        
    int c[][]=new int[3][3]; 
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
    c[i][j]=a[i][j]+b[i][j];     
    System.out.print(c[i][j]+" ");    
    }    
    System.out.println();    
    }    
    }}  