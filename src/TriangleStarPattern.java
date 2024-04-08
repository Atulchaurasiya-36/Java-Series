public class TriangleStarPattern {

//     right triangle star pattern
    public static void rightTriangle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

   // inverted right triangle star pattern.

    public static void invertedRightTriangle(){
        for(int i=5;i>=1;i--){
      for(int j=1;j<=5;j++){
       if(j<=i){
           System.out.print("*");
      }

        }
            System.out.println();
        }
    }


    //mirrored right triangle star
    public static void mirroredRightTriangle(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=6-i && j<=5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

//     Inverted Half Pyramid Star Pattern.

    public static void invertedHalfPyramid(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j>=i && j<=5){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
//        rightTriangle();
//        invertedRightTriangle();
////        mirroredRightTriangle();
//        invertedHalfPyramid();


    }
}
