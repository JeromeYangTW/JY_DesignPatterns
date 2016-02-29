package behavioral.template;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestTemplateJY
{
	enum TYPE { DATABASE, FILE }
	
	@Test
	public void Test()
	{
		TemplateDbParserJY dp = new TemplateDbParserJY( "127.0.0.1/MSSQL" );
		TemplateDataJY ddata = dp.DoParse();
		assertEquals( "MSSQL", ddata.GetName() );
		assertEquals( TYPE.DATABASE.ordinal(), ddata.GetType() );
		
		TemplateFileParserJY fp = new TemplateFileParserJY( "/Test/Test.txt" );
		TemplateDataJY fdata = fp.DoParse();
		assertEquals( "Test.txt", fdata.GetName() );
		assertEquals( TYPE.FILE.ordinal(), fdata.GetType() );
	}
}
