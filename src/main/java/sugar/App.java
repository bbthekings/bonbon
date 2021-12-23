package sugar;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( theSmaller(23, 230) );
        System.out.println( theSmaller(123, 1230) );
    }
    
    public static int theSmaller(final int x, final int y) {
		
    	return ( x < y ? x:y);
    	
    }
}
