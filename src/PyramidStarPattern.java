public class PyramidStarPattern {

    //Full Pyramid Star pattern.

    public static void fullPyramid(){
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
    }

    //inverted pyramid star pattern.
    public static void invertedPyramid(){
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                if(j>=i && j<=10-i && k>=1){
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
//        fullPyramid();
//        invertedPyramid();


    }
}
