package br.com.codenation.desafioexe;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DesafioApplication {


	public static List<Integer> fibonacci()
	{
		List<Integer>listFibonnaci = Stream.iterate(new int[]{0, 1}, n -> new int[]{ n[1], n[0] + n[1] })
				.limit(15)
				.map(r -> r[0])
				.collect(Collectors.toList());

		return listFibonnaci;

	}


	public static Boolean isFibonacci(Integer number)
	{
		return fibonacci().contains(number);
	}

}