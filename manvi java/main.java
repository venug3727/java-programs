class Grocery
{
      double dal;
      double pulses;
      double sugar;
      Grocery(){
         dal=sugar=pulses;
      }
     void calc_Quantity{
         System.out.println((dal*150)+pulses*80 + sugar*50);
     }
}
class Main
{    
     public static void main(String args[]){
          Grocery G1=new Grocery();
          Grocery G2=new Grocery();
          G1.calc_Quantity();
          G2.calc_Quantity(); 
     }
}


 















