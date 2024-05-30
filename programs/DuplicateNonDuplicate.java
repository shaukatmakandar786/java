import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        List<Integer> list=Arrays.asList(1,2,4,1,2,1,1,5,6);
		
		Map<Integer, Integer> dup=getDuplicate(list);
		
	    List<Integer> duplicate=new ArrayList<>();
	    List<Integer> nonDuplicate=new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry: dup.entrySet()){
			
			if(entry.getValue()>1){
			    
			    duplicate.add(entry.getKey());
			}
			else{
			    nonDuplicate.add(entry.getKey());
			    
			}
		}
		
		System.out.println("duplicate : "+duplicate);
		System.out.println("nonDuplicate : "+nonDuplicate);
        
    }
    
    public static Map<Integer, Integer> getDuplicate(List<Integer> list){
	
		Map<Integer, Integer> data=new HashMap<Integer, Integer>();
		
		for(Integer i1: list){
			
			if(!data.containsKey(i1)){
				
				data.put(i1, 1);
			}
			else{
				
				data.put(i1, data.get(i1)+1);
			}
		}
		
		return data;
	}
}



/*

duplicate : [1, 2]
nonDuplicate : [4, 5, 6]

*/
