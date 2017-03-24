class polygon
{
	protected int height;
	protected int width;
	public void set(int a,int b)
	{
		height=a;
		width=b;
	}
	public static void main(String r[])
	{
		rectangle rec= new rectangle();
		triangle tri=new triangle();
		
		rec.set(10,10);
		tri.set(10,10);
		
		System.out.println("Area of Rectangle is "+rec.area());
		System.out.println("Area of Triangle id "+tri.area());
	}
}
class rectangle extends polygon
{
	public double area()
	{
		return (height*width);
	}
}
class triangle extends polygon
{
	public double area()
	{
		return (height*width)/2;
	}
}