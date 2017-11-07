package Java8;

import java.util.stream.Stream;

public class StreamIterator {

	public static void main(String[] args){  
        Stream.iterate(3, element->element+3)  
        .filter(element->element%6==0)  
        .limit(7)  
        .forEach(System.out::println);  
    }  
	
	
}
