//Exercício dos elefantes

class Exerc1{
    public static void main(String args[]){
    	int i,j;
    	for (i=1;i<=7;i++){
    		System.out.print(i);
    		if (i==1)
    		System.out.println(" elefante atrapalha muita gente.");
    		else{
    		System.out.print(" elefantes");
    		for (j=i;j>0;j--){
    			System.out.print(" atrapalham,");
    			}
    			System.out.println(" muita gente.");
    		}
    	}
    }
}
