package com.sg.airlines;

public class DocumentCounter {
    
    public static class Counter {
        private int count = 0;
        private int increment;
        
        public Counter(int increment) {
            this.increment = increment;
        }
    
        public int getAndIncrement() {
            int countBeforeIncrement = count;
            count += increment;
            return countBeforeIncrement;
        }
    }
    
    public static class DocumentNameCreator{
        private String prefix;
        private Counter counter;
        
        public DocumentNameCreator(int increment, String prefix) {
            super();
            this.prefix = prefix;
        }
        
        public DocumentNameCreator(String prefix,Counter counter) {
            super();
            this.prefix = prefix;
            this.counter = counter;
        }
    
        public String getNewDocumentName() {
            return prefix + this.counter.getAndIncrement() ;
         }
    }
}