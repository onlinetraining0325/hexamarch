package com.java.hib;

import com.java.hib.util.SessionHelper;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println(SessionHelper.getSession());
  }

}
