package march_4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class StreamAPIDemo1 
{
    public static void main(String[] args) 
    {
		List<Integer> values=Arrays.asList(1,2,3,4,5,6);
		for (int i = 0; i < 6; i++) 
		{
			System.out.println(values.get(i));
		}
		Iterator<Integer> iValues=values.iterator();
		while(iValues.hasNext())
		{
			System.out.println(iValues.next());
		}
		for (int i : values) 
		{
			System.out.println(i);
		}
		values.forEach(i->System.out.println(i));
		values.forEach(new Consumer<Integer>()
		{
			public void accept(Integer i)
			{
				System.out.println(i);
			}
		});
		values.forEach(System.out::println);
	}
}
