package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	if(args.length == 0)
        {
            System.out.println( "Hello World!" );
        }
        else
        {
            String sPrint = "";
            for(String s: args)
            {
                sPrint = sPrint.concat(s).concat(" ");
            }
            System.out.println( sPrint );
        }
        
    }
}