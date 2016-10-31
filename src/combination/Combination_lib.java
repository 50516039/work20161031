package combination;

public class Combination_lib {
	private int n;
	public Combination_lib(int n) {
		this.n = n;
		}
	
	public int getFactorial(int n){
		int f=1;
		for(int i=n;i>=0;i--){
			if(i==0) f*=1;
			else f*=i;
		}
	return f;
	}
	
}
