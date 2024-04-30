package hackerrankpractice.easy;



class MyRegex {
	//public String pattern;

		// Function to validate the IPs address.
	    
	    
	 
	        // Regex for digit from 0 to 255.
	        String zeroTo255
	            = "(\\d{1,2}|(0|1)\\"
	              + "d{2}|2[0-4]\\d|25[0-5])";
	 
	        // Regex for a digit from 0 to 255 and
	        // followed by a dot, repeat 4 times.
	        // this is the regex to validate an IP address.
	        public String pattern
	            = zeroTo255 + "\\."
	              + zeroTo255 + "\\."
	              + zeroTo255 + "\\."
	              + zeroTo255;
	 
	    
}
