/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Aircraft.java                                      :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/25 13:05:52 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/25 14:05:25 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package simulator.vehicles;

import weather.Coordinates;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private long idCounter;
    
    protected Aircraft(String name, Coordinates coordinates) {
        
    }
    private long nextId() {
        return nextId();
    }
}

public class Helicopter {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {

    }
    public void updateConditions() {

    }
    public void registerTower(WeatherTower weatherTower) {

    }
}

public class JetPlane {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {

    }
    public void updateConditions() {

    }
    public void registerTower(WeatherTower weatherTower) {
        
    }
}

public class Baloon {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {

    }
    public void updateConditions() {

    }
    public void registerTower(WeatherTower weatherTower) {
        
    }
}