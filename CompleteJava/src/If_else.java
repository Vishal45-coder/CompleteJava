public class If_else {
    public static void main(String[] args){
         int num=200;
         if(num<500 && num>200)
         {
             System.out.println(num);
         }
         else if(num<100){
             System.out.println(num);
         
         }
         else{
            //This will be not execute because it was inside code blocks
            System.out.println("This is score");
            System.out.println("this is also score");
         }
    }
    
}
