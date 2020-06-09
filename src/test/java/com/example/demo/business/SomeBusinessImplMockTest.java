package com.example.demo.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
class SomeBusinessImplMockTest {
	
	@InjectMocks
	SomeBusinessImpl business = new SomeBusinessImpl();
	
	@Mock
	SomeDataService dataServiceMock;
	
	
	
	//SomeDataService dataServiceMock = mock(SomeDataService.class);
	
//	@BeforeEach
//	public void before() {
//		business.setSomeDateService(dataServiceMock);
//	}

	@Test
	void calculateSumUsingDataService_basic() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {1, 2, 3});
		assertEquals(6, business.calculateSumUsingDataService());
	}
	
	@Test
	void calculateSumUsingDataService_empty() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(0, business.calculateSumUsingDataService());
	}
	
	@Test
	void calculateSumUsingDataService_oneValue() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {5});
		assertEquals(5, business.calculateSumUsingDataService());
	}

}
