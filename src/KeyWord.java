//How to use this



public class KeyWord {

  static  String food;
  static char size;


    int a;
    int b;

   public void setData(String food, char size){
    this.food = food;
    this.size = size;
}


   public void setData(int a , int b){

     KeyWord t  =  new KeyWord();

       this.a = a;
       this.b = b;

   }

   public static void main(String[]args) {
      //setData(4,3 );

         KeyWord t  =  new KeyWord();
            System.out.println( t.a );
            System.out.println( t.b );

   }

}
