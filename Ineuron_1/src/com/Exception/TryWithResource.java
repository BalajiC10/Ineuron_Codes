package com.Exception;

import java.io.BufferedReader;
import java.io.IOException;

public class TryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		try(BufferedReader br = new BufferReader(new FileReader("Sample.txt"))){
//			//use resource
//		}
//		catch(IOException e) {
//			
//		}
		
		/*
		 * TryWithResource- > Introduced in 1.7JDK 
		 * ->It will close the resources despite exception occured or not
		 * ->It will reduce the redundant code
		 * Advantage of try with Resource
======================
1. The main advantage of try with resource is the resources which are a part of
try block gets close automatically.
once the control comes of out try block automatically that resource will be
closed.
while try block is getting executed

a. exception occured and handled
b. exception occured and not handled

In both these cases also jvm will close the resource automatically, if we
use resource with "try with resource".
2. Using try with resource increases readabilty and reduces redundant code in our
application.
		 */
	}

}
