public class recurssion {  
static void p(int a, int b){ 

    System.out.println(a+b);  
   

p(a,b);  
}  
  
public static void main(String[] args) {  
    
p(2,3); 
}  
}  