class Solution{
public:

	int search(string pat, string txt) {
	    
	    unordered_map<char, int> countMap;
	    int anagramCount = 0;


		// Stores thd distinct characters needed in total.
		// For eg for  3
		//        adaa 2
		//        yumu 3
	    int targetCountOfDistinctLetters;
	    
	    // Set the target map
	    for(auto&& i : pat)
	        countMap[i]++;
	    
		// How many numbers of distinct characters are there is size of map itslef.
	    targetCountOfDistinctLetters = countMap.size();
	    
	    // Get the first window.
	    for(int i = 0; i < pat.size(); i++){
	        if(countMap.find(txt[i])!=countMap.end())
	            countMap[txt[i]]--;
	    }
	    
	    // Set Counters
	    for(auto&& i : countMap){
	        if(i.second==0)  targetCountOfDistinctLetters--;
	    }
	        
	    if(targetCountOfDistinctLetters==0)   anagramCount++;     
	        
	    // Slide thew Window
	    for(int i = pat.size(); i < txt.size(); i++){
	        
	        if(countMap.find(txt[i])!=countMap.end()){
    	        countMap[txt[i]]--;

				// Previously was 0 but now disbalanced.
    	        if(countMap[txt[i]]+1 == 0) targetCountOfDistinctLetters++;
    	        
				// Just now reached 0.
				if(countMap[txt[i]] == 0) targetCountOfDistinctLetters--;
	        }
	        
	        if(countMap.find(txt[i-pat.size()])!=countMap.end()){
    	        countMap[txt[i-pat.size()]]++;

				// Previously was 0 but now disbalanced.
    	        if(countMap[txt[i-pat.size()]]-1 == 0) targetCountOfDistinctLetters++;

				// Just now reached 0.
    	        if(countMap[txt[i-pat.size()]] == 0) targetCountOfDistinctLetters--;
	        }
	        
			// If everything is balanced means its anagram so increase its count.
	        if(targetCountOfDistinctLetters==0)   anagramCount++;
	    }
	    
	    return anagramCount;
	    
	}

};
