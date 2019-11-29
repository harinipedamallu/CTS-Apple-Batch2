package com.cts.training.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamEx {
	
	// long: amount of time consumed by each process
	public static long checkPerformance(Supplier<Integer> sum, int repeat) {
		
		long start = System.currentTimeMillis();
		
		for(int i=1;i<=repeat; i++)
			sum.get();
		
		long end = System.currentTimeMillis();
		return end - start;
		
	}

	public static int sumSeqStream() {
		
		int total = IntStream.rangeClosed(1,1000000).sum();
		return total;
	}
	
	public static int sumParallelStream() {
		
		int total = IntStream.rangeClosed(1,1000000).parallel().sum();
		return total;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sequential Sum : " + sumSeqStream());
		System.out.println("Parallel Sum : " + sumParallelStream());
		
		
		// fetch number of processing unit in machine
		System.out.println("Available processors : " + Runtime.getRuntime().availableProcessors());
		
		System.out.println("Time consumed by Sequential process : " + checkPerformance(ParallelStreamEx::sumSeqStream, 20));
		System.out.println("Time consumed by Parallel process : " + checkPerformance(ParallelStreamEx::sumParallelStream, 20));
	}

}
