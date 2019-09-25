//**VADADA VENKATA NAGA DINESH**//
//**Github user Id vvndinesh**//

class Primenumber
{
	public static void main(String[] args) {
		int num=5;
		int i;
		boolean isprime=true;

		for(i=2;i<num;i++)
		{
			 if(num%i==0)
			 {
			 	isprime=false;
			 	break;
			 }

		}
		 if(isprime)
			 {
			 	System.out.println(num+ "" "this is a prime number");
			 }
			 else
			 {
			 	System.out.println("this is not a prime number"+num);
			 }
	}
}
