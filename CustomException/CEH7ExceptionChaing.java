
public class CEH7ExceptionChaing {

	public static void main(String[] args) {
		try {
			
			NumberFormatException nfe = new NumberFormatException("Exception");
			
			nfe.initCause(new NullPointerException("Reson for exception"));
			
			throw nfe;
			
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			
			System.out.println(nfe);
			
			System.out.println(nfe.getCause());
		}
	}
	
}
