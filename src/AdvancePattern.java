public class AdvancePattern {

    // Pant's style Star Pattern.

    public static void pantsStyle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j<=6-i || j>=4+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }





    // Inverted Pant's Shape Star Pattern.

    public static void invertedPantsStyle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j<=i || j>=10-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





    //butterfly shape star pattern.

   public static void butterflyShape(){
       for(int i=1;i<=5;i++){
           for(int j=1;j<=9;j++){
               if(j<=i || j>=10-i){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
//    +++++++++++++++++++++ inverted++++++++++++

       for(int i=1;i<=4;i++){
           for(int j=1;j<=9;j++){
               if(j<=5-i || j>=5+i){
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }


   }

    public static void main(String[] args) {
//        pantsStyle();
//        invertedPantsStyle();
        butterflyShape();

    }
}
