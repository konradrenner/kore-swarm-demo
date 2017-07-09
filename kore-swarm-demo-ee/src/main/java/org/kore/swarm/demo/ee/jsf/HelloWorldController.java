/*
 * Copyright (C) 2017 koni
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
package org.kore.swarm.demo.ee.jsf;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.kore.swarm.demo.ee.ejb.TestServiceBean;

/**
 *
 * @author koni
 */
@Named("helloWorld")
@RequestScoped
public class HelloWorldController {
    
    @Inject
    TestServiceBean bean;
    
    public String getHelloWorld(){
        return bean.getHelloWorld();
    }
}
