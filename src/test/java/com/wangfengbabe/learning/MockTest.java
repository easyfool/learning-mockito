package com.wangfengbabe.learning;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by wangfeng on 21/05/2017.
 */
public class MockTest {

  @Test
  public void testMock() {
    List mockedList = mock(List.class);
    when(mockedList.get(0)).thenReturn("first");
    System.out.println(mockedList.get(0));
    mockedList.add("one");
    mockedList.clear();
    verify(mockedList).add("one");
    verify(mockedList).clear();
    System.out.println(mockedList.get(99));
    verify(mockedList, atLeastOnce()).get(anyInt());
  }

  @Test
  public void testSpy() {
    List list = new LinkedList();
    List spy = Mockito.spy(list);
    doReturn("foo").when(spy).get(0);
    //when(spy.get(0)).thenReturn("foo");
    spy.add("one");
    spy.add("two");
    verify(spy).add("one");
    System.out.println(list);
  }


}
