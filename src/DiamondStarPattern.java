public class DiamondStarPattern {


//    Half Diamond Star Pattern.
    public static void halfDiamond(){
        int k=1;
        for(int i=1;i<=9;i++){
            for(int j=1;j<=5;j++){
                if(j<=k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            k=(i<5)? k+1 :k-1;
        }
    }




    //Solid Inverted Half Diamond Star Pattern.
    public static void invertedHalfDiamond() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= 6 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





    //Double Pyramid Star Pattern.
    public static void doublePyramid(){
        int k=6;
        for(int i=1;i<=11;i++){
            for(int j=1;j<=6;j++){
                if(j<=k){
                    System.out.print("*");
                }
            }
            if(i<6) k--;
            if(i==6)k=2;
            System.out.println();
            if(i>6)k++;
        }
    }


    // solid Diamond Star Pattern.
    public static void solidDiamond(){
        int k=1;
        for(int i=1;i<=5;i++){
            k=1;
            for(int j=1;j<=9;j++){
                if(j>=6-i && j<=4+i && k>=1){
                    System.out.print("*");
                    k=0;
                }
                else {
                    System.out.print(" ");
                    k++;
                }
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j>=i && j<=9-i && k>=1){
                    System.out.print("*");
                    k=0;
                }
                else{
                    System.out.print(" ");
                    k++;
                }
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
//        halfDiamond();
//        invertedHalfDiamond();
//        doublePyramid();
        solidDiamond();

    }
}
