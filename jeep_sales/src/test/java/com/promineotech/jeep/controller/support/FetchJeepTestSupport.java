/**
 * 
 */
package com.promineotech.jeep.controller.support;

import java.util.LinkedList;
import java.util.List;
import com.promineotech.jeep.entity.Jeep;

public class FetchJeepTestSupport extends BaseTest {

  protected List<Jeep> buildExpected() {
    List<Jeep> list = new LinkedList<Jeep>();
    
    Jeep j1 = newJeep();
    
    return list;
  }
  
}
