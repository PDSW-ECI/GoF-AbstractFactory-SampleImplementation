/*
 * Copyright (C) 2015 hcadavid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package edu.eci.pdsw.examples.absfact;

import edu.eci.pdsw.examples.absfact.products.ProductAVarietyY;
import edu.eci.pdsw.examples.absfact.products.ProductA;
import edu.eci.pdsw.examples.absfact.products.ProductB;
import edu.eci.pdsw.examples.absfact.products.ProductBVarietyY;

/**
 *
 * @author hcadavid
 */
public class VarietyYFactory extends Factory{
    
    @Override
    public ProductA getProductA(){
        return new ProductAVarietyY();
    }
    
    @Override
    public ProductB getProductB(){
        return new ProductBVarietyY();
    }
    
}
