package com;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

import beans.Item;

/**
 * Build a self-cleaning refrigerator where customers add items with a fixed expire date. 
 * <p/>
 * The fridge is connected to trash chute and automatically removes expired items.
 * 
 *
 */

public class SmartFridgeTest {

	private static final int TEN_SEC = 10_000;
	private SmartFridge subject;

    @Before
    public void setUp() {
        subject = new SmartFridge();
    }
	
	@Test
	public void adddingAndRemovingItems() throws Exception {
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		
		calendar.add(Calendar.SECOND, 10);
		calendar2.add(Calendar.SECOND, 100);
		//given
		IntStream.range(0, 100).forEach(i -> {
			subject.addItem(new Item("item#" + i, calendar.getTime()));
		});
		
		
		Item milk = new Item("milk", calendar2.getTime());
		subject.addItem(new Item("cheese", calendar2.getTime()));
		subject.addItem(milk);
		
		//then
		subject.removeExpiredItems();
		
		//verify
		assertEquals(102, subject.getItems().size());
		
		Thread.sleep(TEN_SEC);
		//then
		subject.removeExpiredItems();
		
		//verify
		assertEquals(2, subject.getItems().size());
		
		//then
		
		subject.removeItem(milk);
		
		//verify
		
		assertEquals(1, subject.getItems().size());
	}
	
	
	
}
