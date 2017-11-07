package Java8;

interface A {
	Message getMessage(String msg);
}

class Message {
	public Message (String msg){
		System.out.println(msg);
	}
}

public class RefConstructor {

	public static void main(String[] args) {
		A a=Message::new;
		a.getMessage("Hello");

	}

}
