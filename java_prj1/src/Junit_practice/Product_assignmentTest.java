package Junit_practice;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class Product_assignmentTest {

	static HashMap<Integer,Product> test_hm = new HashMap<Integer,Product>();
	Product pro_arr[] = new Product[1];
	
	@SuppressWarnings("static-access")
	@Test
	public void test() {
		
		pro_arr[0] = new Product(101,"mobile",10000,"redmi",14,10000,1);
		//pro_arr[1] = new Product(102,"laptop",12000,"lenovo",23,24000,2);
		for(int i=0;i<pro_arr.length;i++) {
			test_hm.put(pro_arr[i].Product_ID, pro_arr[i]);
		}
		for(Entry<Integer,Product> e:test_hm.entrySet()) {
			System.out.println(e.getValue().Product_ID+" "+e.getValue().Product_Name+" "+e.getValue().Price+" "+e.getValue().Brand+" "+e.getValue().Quantity+" "+e.getValue().total+" "+e.getValue().purchased_qty);
			
		}
		Product_assignment p = new Product_assignment();
		
		p.hello();
		assertEquals(p.pp.get(101).toString(),test_hm.get(101).toString());
//		assertEquals(p.pp.get(101).purchased_qty,test_hm.get(101).purchased_qty);
//		assertEquals(test_hm.get(101).Quantity,p.pp.get(101).Quantity);
		//assertTrue(if(p.func().equals(test_hm)));
		
	}

}
