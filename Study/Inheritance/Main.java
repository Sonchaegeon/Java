package P2;

public class Main {
	
	public static void main(String[] args) {
		Eagle eagle = new Eagle();
		Goldfish goldFish = new Goldfish();
		Tiger tiger = new Tiger();
		
		eagle.fly();
		goldFish.swim();
		tiger.run();
		
		eagle.eat();
	}
}
