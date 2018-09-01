interface Animals
{
	void speak();
	void eat();
}
class dog implements Animals
{
	public void speak()
	{
		System.out.println("bow-bow");
	}
	public void eat()
	{
		System.out.println("i eat pedigree");
	}
}
class cat implements Animals
{
	public void speak()
	{
		System.out.println("meaw-meaw");
	}
	public void eat()
	{
		System.out.println("i eat friskies");
	}
}
class main
{
	public static void main(String[] args)
	{
		Animals obj=new dog();
		obj.speak();
		obj.eat();
		Animals obj1=new cat();
		obj1.speak();
		obj1.eat();
	}
}