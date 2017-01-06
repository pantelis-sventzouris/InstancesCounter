package gr.pantelis;

public class InstancesCounter
{
	private static int counter = 0;
	
	public InstancesCounter()
	{
		counter++;
	}

	//tests the application
	public static void main(String[] args)
	{
		System.out.println(new InstancesCounter().getInstances()); //first instance
		
		InstancesCounter ic1 = new InstancesCounter();		//second instance
		InstancesCounter ic2 = new InstancesCounter();		//third instance
		InstancesCounter ic3 = new InstancesCounter();		//fourth instance
		InstancesCounter ic4 = new InstancesCounter();		//fifth instance
		
		System.out.println(counter);	//displays the total number of instances of this class
	}
	
	public static int getInstances()
	{
		return counter;
	}
}
