package in.hashing;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String  []words = {"acabcddd","bcbdbcbd","baddbadb","cbdddcac","aacbcccd","ccccddda","cababaab","addcaccd"};
	
	//Output: ["e","l","l"]
	int arr[] = new int[27];
	for(int i=0;i<words.length;i++){

        String word = words[i];
        
        for(int j=0;j<word.length();j++){
        	
        	//System.out.println(word.charAt(j));
        	arr[word.charAt(j)-96]++;
            
        }
        break;
       
    	}
        
	 for(int k=0;k<arr.length;k++) {
 		System.out.println(k+"-->"+arr[k]);
 		if(arr[k]==words.length) {
 			char c = (char)(96+k);
 			String ans = Character.toString(c);
 			//System.out.println(ans);
 		}
 		if(arr[k]>words.length && arr[k]<words.length*2) {
 			char c = (char)(96+k);
 			//System.out.println(c);
 		}
 		
 		if(arr[k]>=words.length*2) {
 			char c = (char)(96+k);
 			//System.out.println(c);
 			//System.out.println(c);
 		}

    }
	
	
		
		
	}

}
