/*
 * Copyright 2015-04-02 the original author or authors.
 */
package pl.com.softproject.szkolenie.poznan.srevices;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Service
@Qualifier("superService")
public class MyServiceSuperImpl implements MyService {

    public String metoda() {
        return "129828282882";
    }
    
}
