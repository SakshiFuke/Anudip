package com.demo;

class MeraException extends NullPointerException
{
	private int ex;
	public MeraException(int ex)
	{
		super();
		this.ex=ex;
	}
	@Override
	public String toString()
	{
		return "MeraException[ex="+ex+"]";
		
	}
	
}
public class UserDefineException {

	static void sum(int a, int b) throws MeraException
	{
		if(a<0)
		{
			throw new MeraException(a);
		}
	}
	public static void main(String[] args)throws MeraException {
		//UserDefineException ud =new UserDefineException();
		
		try
		{
			sum(-10,10);
		}
		catch(MeraException e)
		{
			System.out.println(e);
		}
	}

}
