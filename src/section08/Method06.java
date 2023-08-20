package section08;

public class Method06 {
	public static void main(String[] args) {
		
		String pokemon = getPokemon();
		
		System.out.println("pokemon: " + pokemon);
		
	}
	
	
	// 6. 인자 X, 리턴 O - 메서드 호출시 값 반환
	
	public static String getPokemon() {
		String pokemon = "피카츄";
		
		//리턴타입이랑 반환하는 타입 똑같아야 컴파일에러 발생하지 않음
		return pokemon; 
	}

}
