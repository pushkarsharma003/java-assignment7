abstract class Animals
{
	String breed="labra",color="black",name="dog";
	abstract void eat();
	public void speak()
	{
		System.out.println("it speaks bow-bow");
	}
}
class test extends Animals
{
	void eat()
	{
		System.out.println("name :"+name);
		System.out.println("breed :"+breed);
		System.out.println("color :"+color);
	}
}
class Main
{
	public static void main(String[] args)
	{
		Animals obj=new test();
		obj.eat();
		obj.speak();
	}
}