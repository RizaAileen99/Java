import java.util.Scanner;
public class waterbill_Paulan {

public static void main(String args[]) {
Scanner console = new Scanner (System.in);
int Anum, gow ;
double amountdue;
char code;
String confirm;
do{

System.out.print("En­ter Your Account Number :\n");
Anum = console.nextInt();

System.out.print("En­ter your code of Billing :\n");
code = console.next();

System.out.print("En­ter amount of Gallons :");
gow = console.nextInt();

if(code == 'h'||code == 'H'){
amountdue = (gow*0.005)+5;
System.out.println("The amount is due is $"+amountdue);

}
else if (code == "i"||code == "I"||code == "Industrial"||code == "industrial"){
if (gow<4000){
System.out.print("Account Number : "+Anum);
System.out.print("Code of Billing : "+code);
System.out.print("Amount of Gallons :"+gow);
System.out.print("The Amount Due for your WaterBill : $1000");
}
else if(gow>4000&&gow<10000){
System.out.print("Account Number : "+Anum);
System.out.print("Code of Billing : "+code);
System.out.print("Amount of Gallons :"+gow);
System.out.print("The Amount Due for your WaterBill : $2000");
}
else if(gow>10000){
System.out.print("Account Number : "+Anum);
System.out.print("Code of Billing : "+code);
System.out.print("Amount of Gallons :"+gow);
System.out.print("The Amount Due for your WaterBill : $3000");
}else{
System.out.print("Invalid Input!!!");
}
}
else if (code == "c"||code == "C"||code == "Commercial"||code == "commercial"){
if (gow>4000){
amountdue = (0.025*gow) + 1000;
System.out.print("Account Number : "+Anum);
System.out.print("Code of Billing : "+code);
System.out.print("Am­ount of Gallons :"+gow);
System.out.print("The Amount Due for your WaterBill :$ "+amountdue);
}else if (gow<4000){
amountdue = (0.025*gow);
System.out.print("Account Number : "+Anum);
System.out.print("Code of Billing : "+code);
System.out.print("Amount of Gallons :"+gow);
System.out.print("The Amount Due for your WaterBill :$"+amountdue);
}else{
System.out.print("Invalid Input!!!");
}
}System.out.print("Would you like to Continue?[Yes or No]");
confirm = console.nextLine();

}while(confirm == "Yes"||confirm == "YES"||confirm == "yes");
}


}