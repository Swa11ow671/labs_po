package com.example.lab4.Factory.Factorys;

import com.example.lab4.Factory.Arrows.CompositionArrow;
import com.example.lab4.Factory.Interface.Arrow;
import com.example.lab4.Factory.Interface.ArrowFactory;

public class CompositionFactory implements ArrowFactory {
    @Override
    public Arrow createArrow() {
        return new CompositionArrow();
    }
}
