/*
 * Created on Apr 29, 2007
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright @2007-2013 the original author or authors.
 */
package org.fest.util;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.rules.ExpectedException.none;

/**
 * Tests for {@link Lists#newArrayList(Object...)}.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class Lists_newArrayList_withVarArgs_Test {
  @Rule public ExpectedException thrown = none();

  @Test
  public void should_return_List_containing_all_elements_in_array() {
    String[] expected = {"One", "Two"};
    ArrayList<String> list = Lists.newArrayList(expected);
    assertArrayEquals(expected, list.toArray());
  }

  @Test
  public void should_throw_error_if_array_is_null() {
    thrown.expect(NullPointerException.class);
    Object[] elements = null;
    assertNull(Lists.newArrayList(elements));
  }

  @Test
  public void should_return_empty_List_if_array_is_empty() {
    ArrayList<Object> list = Lists.newArrayList(new Object[0]);
    assertTrue(list.isEmpty());
  }
}
