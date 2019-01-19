public class Calculator {
	private int result;

	public void sum(int ... params){
		for (int param : params){
				this.result += param;
		}
	}

	public int getResult(){
		return this.result;
	}

	public void cleanResult(){
		this.result = 0;
	}
}