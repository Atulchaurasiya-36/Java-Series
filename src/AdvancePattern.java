public class AlphabetPattern {

    //   Inverted V Star Pattern.

    public static void vShape(){
        int k=1;
        for(int i=1;i<=4;i++){
            k=1;
            for(int j=1;j<=7;j++){
                if(j>=5-i && j<=3+i && k==1){
                    System.out.print("*");
                    k=0;
                }
                else{
                    System.out.print(" ");
                    if(j==(3+i)-1)k=1;
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        vShape();

    }
}
