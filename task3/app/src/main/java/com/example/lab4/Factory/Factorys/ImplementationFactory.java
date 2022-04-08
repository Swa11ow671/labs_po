package com.example.lab4.Factory.Factorys;

import com.example.lab4.Factory.Interface.Arrow;
import com.example.lab4.Factory.Interface.ArrowFactory;
import com.example.lab4.Factory.Arrows.ImplementationArrow;

public class ImplementationFactory implements ArrowFactory {
    @Override
    public Arrow createArrow() {
        return new ImplementationArrow();
    }
}
