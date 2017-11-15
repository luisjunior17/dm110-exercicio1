package br.inatel.dm110.hello.impl;

import br.inatel.dm110.hello.api.HelloService;
import br.inatel.dm110.hello.api.Result;

public class HelloServiceImpl implements HelloService {


	@Override
	public Result soma(int num1, int num2) {
		
		Result result = new Result();
		result.setFirstNum(num1);
		result.setLastNum(num2);
		
		int resultado = num1 + num2;
		
		result.setResult(resultado);
		
		return result;
	}

	@Override
	public Result subtracao(int first, int last) {
		Result result = new Result();
		result.setFirstNum(first);
		result.setLastNum(last);
		
		int resultado = first - last;
		
		result.setResult(resultado);
		
		return result;
	}

}
