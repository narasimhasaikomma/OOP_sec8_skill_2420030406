package sikll_4;

		public class finalkeyword{
		    private final int myNumber;

		    private final StringBuilder message = new StringBuilder("Hello");

		    public finalkeyword(int num) {
		        this.myNumber = num; 
		    }
		    public final void displayNumber() {
		        System.out.println("Final variable myNumber = " + myNumber);
		    }

		    public void modifyMessage() {
		     
		        message.append(", World!");
		        System.out.println("Modified message: " + message);

		        
		    }

		    public static void main(String[] args) {

		        finalkeyword obj = new finalkeyword(42);

		        obj.displayNumber();

		       
		        obj.modifyMessage();
		    }
		

	}


