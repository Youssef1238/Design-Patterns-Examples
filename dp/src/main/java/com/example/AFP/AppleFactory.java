package com.example.AFP;

import com.example.AFP.Products.IPadPro;
import com.example.AFP.Products.IPhone15;
import com.example.AFP.Products.Smartphone;
import com.example.AFP.Products.Tablet;

public class AppleFactory implements TechFactory{

    @Override
    public Smartphone createSmartphone() {
        return new IPhone15();
    }

    @Override
    public Tablet createTablet() {
        return new IPadPro();
    }

}
