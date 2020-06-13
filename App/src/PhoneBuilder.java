public class PhoneBuilder
{
	private static Phone p;
	
	public PhoneBuilder build()
	{
		p=new Phone();
		return this;
	}
	
	public PhoneBuilder withOs(String os)
	{
		p.setOs(os);
		return this;
	}
	
	public PhoneBuilder withName(String name)
	{
		p.setName(name);
		return this;
	}
	
	public PhoneBuilder withProcessor(String processor)
	{
		p.setProcessor(processor);
		return this;
	}
	
	public PhoneBuilder withScreen(float screensize)
	{
		p.setScreensize(screensize);
		return this;
	}
	
	public PhoneBuilder withBattery(int battery)
	{
		p.setBattery(battery);
		return this;
	}
	
	public PhoneBuilder withCamera(int camera)
	{
		p.setCamera(camera);
		return this;
	}

	public Phone commit()
	{
		return p;
	}
	
	
}
