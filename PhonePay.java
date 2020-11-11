class PhonePay{
	public static void Payment(long Mobileno){
		System.out.println("your mobile recharge done Successful");
		}
	public static void Payment(String DTH){
		System.out.println("your "+ DTH +" number bill paid successfully");
		}
	public static void Payment(int meterid,String name,int amount){
		System.out.println("paid electricity bill of"+ meterid +"rupees" + amount +"of" +name);
		} 
	public static void Payment(int creditcardno,int amount){
		System.out.println("credit card bill paid successfully for"+ creditcardno +"for amount"+amount);
}
        public static void main(String[] args){
	 PhonePay.Payment(803729023);	
	 PhonePay.Payment("E-DigitalDTH125692");
	 PhonePay.Payment(172462,"rajesh",2500);
	 PhonePay.Payment(5634456,3400);
	}
        }