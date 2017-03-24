/*
 *Interfaces specify what a class must do and not how. It is the blueprint of the class.
 *In Java, all methods in an interface are public even if we do not specify public with method names.
 *Also, data fields are public static final even if we do not mention it with fields names. Therefore, data fields must be initialized.
 *the classes and interfaces themselves can have only two access specifiers when declared outside any other class.
	1) public
	2) default (when no access specifier is specified)
*/
interface shape
{
	public double area();
	public double perimeter();
	default void xyz()
	{
		System.out.println ("This is default");
	}
	static void display()
	{
		System.out.println ("Static Display");
	}
}
interface shape3d extends shape
{
	public double surfacea();
}
class rectangle implements shape
{
	private double  length;
	private double  breadth;
	public rectangle()
	{
		length=breadth=0;
	}
	public rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	public double area()
	{
		return length*breadth;
	}
	public double perimeter()
	{
		return 2*(length+breadth);
	}
}
class square implements shape
{
	private double  side;
	public square()
	{
		side=0;
	}
	public square(int s)
	{
		side=s;
	}
	public double area()
	{
		return side*side;
	}
	public double perimeter()
	{
		return 4*side;
	}
}
class cylinder implements shape3d
{
	private double radius;
	private double height;
	public cylinder()
	{
		radius=height=0;
	}
	public cylinder(int r,int h)
	{
		radius=r;
		height=h;
	}
	public double area()
	{
		return (Math.PI*radius*radius);
	}
	public double perimeter()
	{
		return 4*radius;
	}
	public double surfacea()
	{
		return ((2*Math.PI*radius*height)+(2*Math.PI*radius*radius));
	}
}
class abc
{
	public static void main (String[] args)
	{
		rectangle r=new rectangle(5,6);
		square s=new square(5);
		cylinder c=new cylinder(2,3);
		double x=r.perimeter();
		double y=s.area();
		double z=c.surfacea();
		c.xyz();
		shape.display();
		System.out.println (x);
		System.out.println (y);
		System.out.println (z);
	}
}