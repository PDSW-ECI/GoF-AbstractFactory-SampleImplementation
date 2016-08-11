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

import edu.eci.pdsw.examples.absfact.products.ProductA;
import edu.eci.pdsw.examples.absfact.products.ProductB;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hcadavid
 */
public abstract class Factory {
    
    private static Factory instance=null;
    
    public static Factory getInstance(){
        //In this point is defined which factory will be used.
        //this could also be defined at runtime by using a 
        //configuration file
        instance=new VarietyXFactory();
        
        return instance;
       
        
    }
    
    
    public abstract ProductA getProductA();
    
    public abstract ProductB getProductB();
    
}
