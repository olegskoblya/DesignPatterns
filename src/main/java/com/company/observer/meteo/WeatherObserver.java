package com.company.observer.meteo;

import java.util.HashMap;

/**
 * Created by oskoblya on 08.06.2015.
 */
public interface WeatherObserver {
    void update(HashMap<String, Object> params);
}
