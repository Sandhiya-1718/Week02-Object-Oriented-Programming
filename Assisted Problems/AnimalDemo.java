class Animal{
	String name;
	Animal(String name)
	{
		this.name=name;
	}
	void makeSound()
	{
		System.out.println(name+" makes a sound.");
	}
}
class Dog extends Animal{
	Dog(String name)
	{
		super(name);
	}
	@Override
	void makeSound()
	{
		super.makeSound();
		System.out.println(name+" says: WOOF");
	}
}
class Cat extends Animal{
	Cat(String name)
	{
		super(name);
	}
	@Override
	void makeSound()
	{
		super.makeSound();
		System.out.println(name+" says: MEOW");
	}
}
class Bird extends Animal{
	Bird(String name)
	{
		super(name);
	}
	@Override
	void makeSound()
	{
		super.makeSound();
		System.out.println(name+" says: TWEET");
	}
}
public class AnimalDemo{
	public static void main(String[] args)
	{
		Dog dog=new Dog("Joshi");
		Cat cat=new Cat("Coco");
		Bird bird=new Bird("Lucky");
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
	