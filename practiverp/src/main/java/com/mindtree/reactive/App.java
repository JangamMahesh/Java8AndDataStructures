package com.mindtree.reactive;

import java.io.IOException;
import java.util.List;

import com.mindtree.reactive.programming.ReactiveSources;

import reactor.core.Disposable;
import reactor.core.publisher.Mono;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		// use intermidiatary operations like streams
		//ReactiveSources.intNumberFlux().filter(e->e%2==0).subscribe(e->System.out.println(e))
//		Integer blockFirst = ReactiveSources.intNumberFlux().log().filter(e->e%2==0).blockFirst();
//		System.out.println(" even number "+ blockFirst);
		
		ReactiveSources.intNumberFlux().filter(e->e%2==0).take(2).map(e->e*10).log().subscribe(System.out::println);
		
		// if no value returned default value
		ReactiveSources.intNumberFlux().filter(e->e>20).defaultIfEmpty(11).subscribe(System.out::println);
		
		// print all numbers
		ReactiveSources.intNumberFlux().subscribe(e -> System.out.println(e));
		Disposable subscribe = ReactiveSources.intNumberFlux().subscribe(e -> System.out.println(e));
	
//		Integer[] list=(Integer[]) ReactiveSources.intNumberFlux().toStream().toArray();
//		System.out.println(list.length);
//		System.out.println(list);
		// sync
		List<Integer> collectList = ReactiveSources.intNumberFlux().collectList().block();
		System.out.println(collectList);
		//System.out.println(collectList);
		
		// emits 0 or 1 item it could be any object or list any collection but only one item
		Integer block = ReactiveSources.intNumberMono().block();
		System.out.println(block);
		
		ReactiveSources.intNumberMono().
		subscribe(number->System.out.println(number)
				,err-> System.out.println(err.getMessage())
				, ()-> System.out.println("Completed"));
		
		System.out.println("press enter to nd the program");
		System.in.read();	
		
		
	}
}
