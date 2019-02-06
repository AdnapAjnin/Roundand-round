public class LoopRecursion{

 public static void main(String []args){
        int x = 1;
        int max = 10;
        //whileLoopMethod(x, max); 
        recursiveMethod(x, max);
        
    }
    
    public static void whileLoopMethod(int x, int max){
        while (x < max) {
            for (int i = 0; i < x; i++){
                System.out.print(x);
            }
            System.out.println();
            x++;
        }
    }
    
    public static void recursiveMethod(int x, int max){
        if(x >= max){
            System.out.println();
        }else{
            for(int i = 0; i<x; i++){
                System.out.print(x);
            }
            System.out.println();
            recursiveMethod(x + 1, max);
        }
    }

}
