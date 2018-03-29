package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import main.java.RemoveElementFromArray;
import org.junit.Test;

public class RemoveElementFromArrayTest {

  private static final RemoveElementFromArray removeElementFromArray = new RemoveElementFromArray();

  @Test
  public void shouldCheckForEmptyArrayInput(){
    //given
    int[] nums = {};
    int val = 2;

    //when
    int len = removeElementFromArray.removeElement(nums, val);

    //then
    assertThat(len, equalTo(0));
  }

  @Test
  public void shouldTestForValueWhichIsNotPresentInArray(){
    //given
    int[] nums = {1,2,3,4,5,6,7,8};
    int val = 9;

    //when
    int len = removeElementFromArray.removeElement(nums, val);

    //then
    assertThat(len, equalTo(8));
  }

  @Test
  public void shouldRemoveAllValuesFromArray(){
    //given
    int[] nums = {3,3,3,3,3,3};
    int val = 3;

    //when
    int len = removeElementFromArray.removeElement(nums, val);

    //then
    assertThat(len, equalTo(0));
  }

  @Test
  public void shouldRemoveSpecificValuesFromArray(){
    //given
    int[] nums = {33,4,6,8,1,33,2,54};
    int val = 33;

    //when
    int len = removeElementFromArray.removeElement(nums, val);

    //then
    assertThat(len, equalTo(6));
  }

}
