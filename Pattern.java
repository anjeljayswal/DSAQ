public class Pattern {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for(int j=0;j<=i;j++){
                System.out.print(""+i);
            }
            System.out.println();

        }
        System.out.println();

        for(int i=0;i<n;i++){
            for(int j=n-1; j>=i; j-- ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        // for(int i=1;i<=n;i++){
        //     for(int j=n-1; j>=i; j-- ){
        //         System.out.print(" ");
        //     }
        //     for(int k=1; k<=i; k++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // // System.out.println();
        // for(int i=1;i<=n;i++){
        //     for(int j=1; j<=i; j++ ){
        //         System.out.print(" ");
        //     }
        //     for(int k=n-1; k>=i; k-- ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
         
        

        // pyramid 
        for(int i=1; i<=n;i++){
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
         for(int i=1; i<=n;i++){
            for(int j=n; j>=1; j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print(" "+i);
                }
            }
            System.out.println();
        }

    }

}
