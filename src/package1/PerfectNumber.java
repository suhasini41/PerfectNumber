package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PerfectNumber {

	private boolean perfectNumber(int n) {
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				list.add(i);
			}
		}
		int sum =0;
		System.out.println(list);
		for(Integer i : list)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		if(sum==n)
		{
			return true;
		}
		else
			return false;
	}
	@Test
	public void testCase1()
	{
		Assert.assertEquals(perfectNumber(6), true);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(perfectNumber(8), false);
	}

}
