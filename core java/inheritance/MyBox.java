class Box
{
	double width , depth , height;
	Box(double d,double h,double w)
	{
		depth = d;
		height = h;
		width = w;
	}
	double volume()
	{
		return(width*depth*height);
	}
}
class BoxWeight extends Box
{
	double weight;
	BoxWeight(double d,double h,double w,double we)
	{
		super(d,h,w);
		weight = we;
	}
}
class MyBox
{
	public static void main(String[] args)
	{
		Box ob;
		BoxWeight subObj = new BoxWeight(10,20,30,40);
		BoxWeight sub1 = new BoxWeight(5,4,3,2);
		ob = subObj;
		System.out.println("Volume "+sub1.volume());
		double vol;
		vol = ob.volume();
		System.out.println("Volume "+vol);
		System.out.println("Weight "+subObj.weight);
		ob = sub1;
		System.out.println("volume "+ob.volume());
		System.out.println("Weight "+sub1.weight);
	}
}