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
        if (instance==null){
            Properties prop = new Properties();
            InputStream input = null;
            
            try {
               
                input = ClassLoader.getSystemResourceAsStream("factory.properties");
                prop.load(input);
                
                if (prop.getProperty("variety").equals("X")){
                    instance=new VarietyXFactory();
                }
                else if (prop.getProperty("variety").equals("Y")){
                    instance=new VarietyYFactory();
                }
                else{
                    throw new RuntimeException("Invalid factory configuration.");
                }
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Invalid factory configuration.",ex);
            } catch (IOException ex) {
                Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
                throw new RuntimeException("Invalid factory configuration.",ex);
            }
        }
        
        return instance;
       
        
    }
    
    
    public abstract ProductA getProductA();
    
    public abstract ProductB getProductB();
    
}
