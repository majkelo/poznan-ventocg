/*
 * Copyright 2015-04-02 the original author or authors.
 */
package pl.com.softproject.szkolenie.poznan.srevices;

import org.springframework.stereotype.Service;

/**
 *
 * @author Adrian Lapierre <adrian@soft-project.pl>
 */
@Service
public class MyServiceImpl implements MyService {
    
    @Override
    public String metoda() {
        return "wartosc";
    }
    
}
