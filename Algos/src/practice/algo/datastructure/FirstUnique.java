package practice.algo.datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;

class FirstUnique {
    
    HashSet<Integer> unique = new LinkedHashSet<>();
    HashSet<Integer> nonUnique = new LinkedHashSet<>();

    public FirstUnique(int[] nums) {
        for(Integer no : nums){
            add(no);
        }     
    }
    
    public int showFirstUnique() {
        try{
            return  unique.iterator().next();
        }catch(NoSuchElementException e){
            return -1;
        }     
    }
    
    public void add(int value) {
        if(nonUnique.contains(value)){
            return;
        }      
        else if(unique.contains(value)){
            unique.remove(value);
            nonUnique.add(value);
            return ;
        }
        unique.add(value);
    }
}
