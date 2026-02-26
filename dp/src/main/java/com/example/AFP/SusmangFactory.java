package com.example.AFP;

import com.example.AFP.Products.GalaxyTab;
import com.example.AFP.Products.Smartphone;
import com.example.AFP.Products.SumsangS24;
import com.example.AFP.Products.Tablet;

public class SusmangFactory implements TechFactory {

    @Override
    public Smartphone createSmartphone() {
        return new SumsangS24();
    }

    @Override
    public Tablet createTablet() {
        return new GalaxyTab();
    }

}
