class Phonepay{
public static void Payment(long MobileNumber){
System.out.println("Mobile Number bill paid for Number"+" "+MobileNumber);
}
public static void Payment(String DTH){
System.out.println("DTH Recharge is successful for Number"+" "+DTH);
}
public static void Payment(String Name,int ID,int Amount){
System.out.println("Electricity bill is paid of the Name"+" "+Name+" "+"ID"+" "+ID+" "+" and Amount"+" "+Amount);
}
public static void Payment(int CreditCardNumber,int Amount){
System.out.println("CreditCard Bill Paid Successfully with Number"+" "+CreditCardNumber+" "+"and Amount"+" "+Amount);
}
public static void main(String args[]){
Phonepay.Payment(9876543265L);
Phonepay.Payment("23565478GF");
Phonepay.Payment("Lilly",3256776,600);
Phonepay.Payment(5439487,500);

}
} 