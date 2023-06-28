package com.mindtree.reactive.programming;

import java.time.Duration;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class ReactiveSources {

	public static Flux<String> stringNumberFlux() {
		return Flux.just("one", "two", "three", "four", "five", "six", "seven", "eight")
				.delayElements(Duration.ofSeconds(1));
	}

	public static Flux<Integer> intNumberFlux() {
		return Flux.range(0, 10).delayElements(Duration.ofSeconds(1));
	}

	public static Flux<Integer> intNumbersFluxWithException() {
		return Flux.range(0, 10).delayElements(Duration.ofSeconds(1)).map(e -> {
			if (e == 5)
				throw new RuntimeException("An error number should not b 5");
			return e;

		});
	}
	
	public static Mono<Integer> intNumberMono()
	{
		return Mono.just(42).delayElement(Duration.ofSeconds(1));
	}

}
