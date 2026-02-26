package com.example.AFP;

import com.example.AFP.Products.Smartphone;
import com.example.AFP.Products.Tablet;

public interface TechFactory {
    Smartphone createSmartphone();
    Tablet createTablet();
}
