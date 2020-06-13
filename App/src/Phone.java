public class Phone{

	private String os;
	private String name;
	private String processor;
	private float  screensize;
	private int    battery;
	private int    camera;


	public void setOs(String os)
	{
		this.os = os;
	}

	public String getOs()
	{
		return os;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setProcessor(String processor)
	{
		this.processor = processor;
	}

	public String getProcessor()
	{
		return processor;
	}

	public void setScreensize(float screensize)
	{
		this.screensize = screensize;
	}

	public float getScreensize()
	{
		return screensize;
	}

	public void setBattery(int battery)
	{
		this.battery = battery;
	}

	public int getBattery()
	{
		return battery;
	}

	public void setCamera(int camera)
	{
		this.camera = camera;
	}

	public int getCamera()
	{
		return camera;
	}
	
	@Override
	public String toString()
	{
		String phone="";
		if(this.getOs()!=null) phone+="OS:"+this.getOs()+"\n";
		if(this.getName()!=null) phone+="Name:"+this.getName()+"\n";
		if(this.getProcessor()!=null) phone+="Processor:"+this.getProcessor()+"\n";
		if(this.getScreensize()!=0.0f) phone+="ScreenSize:"+this.getScreensize()+"inch\n";
		if(this.getBattery()!=0) phone+="Battery:"+this.getBattery()+"mAH\n";
		if(this.getCamera()!=0) phone+="Camera:"+this.getCamera()+"MP\n";

		return phone;
	}
	
}
