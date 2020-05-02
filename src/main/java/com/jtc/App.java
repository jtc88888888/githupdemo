package com.jtc;

import com.jtc.service.TestService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        TestService ts=new TestService();
        System.out.println(ts.getme());
        System.out.println( "哈哈哈哈哈" );
    }
}
