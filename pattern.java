public class pattern{

    // 1.
    /* public static void pattern(int n){
        for(int i= 0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
        // 2.
        public static void pattern2(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
        //3.
    public static void pattern3(int n){
        for(int i =1;i<=n;i++){
             for(int j =1;j<=i;j++){
                System.out.print(i+" ");
                
             }
            
             System.out.println();
        }
    }

    //4.

        public static void pattern5(int n){
        for(int i= 1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();

        }
    }
            public static void pattern4(int n){
        for(int i =1;i<=n;i++){
            for(int j =1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void pattern6(int n){
        //outer lopp
        for(int i= 1;i<=n;i++){
            //spaces
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");

            }
            //numbers
            for(int j =1; j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }


        
    */

    public static void main(String[] args){

        // 1.print star
        /*for(int  line =1; line <=4; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2.print inverted star
        
            for(int line = 1; line<=4; line++){
                int n;
                for(int star =1;star<=n-line+1;star++ ){
                    System.out.print("*");
                }
                System.out.println();
            }
        *
        //3.print half pramid number
        int n =4;
        for(int line=1;line<=n;line++){
            for(int number=1;number<=line;number++ ){
                System.out.print(number);
            }
            System.out.println();
        }
        int n =4;
        char ch ='A';
        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        //4.
        int n =4;
        for(int line=0;line<n;line++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        //5.
        int n =5;
        //pattern7(n);
    }
}