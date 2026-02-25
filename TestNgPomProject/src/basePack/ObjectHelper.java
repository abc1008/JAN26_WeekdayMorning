package basePack;

import pageClasses.HeaderPage;

public class ObjectHelper extends BaseClass
{
//	To return all page class objects
	
	
	private static HeaderPage _headerPage;
	
	public static HeaderPage headerPage()
	{
		if(_headerPage == null)
		{
			_headerPage = new HeaderPage(driver);
		}
		
		return _headerPage;
	}
	
	
}
