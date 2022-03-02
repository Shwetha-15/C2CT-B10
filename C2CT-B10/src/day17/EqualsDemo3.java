package day17;
public class EqualsDemo3 
{
	private String name;
	private int id;
	
	public EqualsDemo3(String name, int id) 
	{
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}
    public void setName(String name) 
	{
		this.name = name;
	}
    public int getId() 
	{
		return id;
	}
    public void setId(int id) 
	{
		this.id = id;
	}
    
    @Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	if(obj instanceof EqualsDemo3) {
            EqualsDemo3 equalsSample = (EqualsDemo3) obj;
            if(equalsSample.getName().equals(this.getName())){
                return true;
            }
        }
        return false;       
    }
}
