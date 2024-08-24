package Junit;

public class Junit 
{

	@BeforeClass
	piblic static void beforeclass()
	{
		System.out.println("Before Class");
	}
	
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1");
	}
}

