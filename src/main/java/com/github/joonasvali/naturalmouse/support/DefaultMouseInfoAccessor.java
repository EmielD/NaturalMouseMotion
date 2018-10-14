package com.github.joonasvali.naturalmouse.support;

import java.awt.*;

public class DefaultMouseInfoAccessor implements MouseInfoAccessor {

  @Override
  public Point getMouseInfo() {
    return MouseInfo.getPointerInfo().getLocation();
  }
}