package com.example.lab4.Factory.Factorys;

import com.example.lab4.Factory.Interface.Arrow;
import com.example.lab4.Factory.Interface.ArrowFactory;
import com.example.lab4.Factory.Arrows.AddictionArrow;

public class AddictionFactory implements ArrowFactory {
    @Override
    public Arrow createArrow() {
        return new AddictionArrow();
    }
}
