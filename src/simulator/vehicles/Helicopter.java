/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Helicopter.java                                    :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/27 10:35:43 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/27 13:30:23 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package simulator.vehicles;

import simulator.Simulator;
import simulator.WeatherTower;
import weather.Coordinates;

import java.util.HashMap;

public class Helicopter extends AirCraft implements Flyable {
    private WeatherTower weatherTower;

    Helicopter(String name, Coordinates coordinates) {
        super(name, coordinates);
    }
    
    public void updateConditions() {
        String weather = weatherTower.getWeather(this.coordinates);
        HashMap<String, String> messages = new HashMap<String, String>(){{
            put("SUN", "Feeling the heat!");
            put("RAIN", "Rain, Rain go away, come again another day.");
            put("FOG", "I can't see Goddamn thing, oh wait my eyes are closed ^_^ -> 0_0 Nope, not the issue must be FOG.");
            put("SNOW", "Gosh, it freezing, should of packed in my long johns.");
        }};
        
        if (Weather.equals("SUN"))
            this.coordinates = new Coordinates(
                coordinates.getLongitude() + 10,
                coordinates.getLatitude() + 0,
                coordinates.getHeight() + 2
            );
        else if (weather.equals("RAIN"))
            this.coordinates = new Coordinates(
                coordinates.getLongitude() + 5,
                coordinates.getLatitude() + 0,
                coordinates.getHeight() + 0
            );
        else if (weather.equals("FOG"))
            this.coordinates = new Coordinates(
                coordinates.getLongitude() + 1,
                coordinates.getLatitude() + 0,
                coordinates.getHeight() + 0
            );
        else if (weather.equals("SNOW"))
            this.coordinates = new Coordinates(
                coordinates.getLongitude() + 0,
                coordinates.getLatitude() + 0,
                coordinates.getHeight() + 12
            );
        Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): " + messages.get(weather));
        if (this.coordinates.getHeight() == 0)
        {
            Simulator.writer.println("Helicopter#" + this.name + "(" + this.id + "): landing.");
            this.weatherTower.unregister(this);
            Simulator.writer.println("Tower says: Helicopter#" + this.name + "(" + this.id + ")" + " unregistered from weather tower.");
            
        }
    }
        
        public void registerTower(WeatherTower weatherTower) {
            this.weatherTower = weatherTower;
            this.weatherTower.register(this);
            Simulotor.writer.println("Tower says: Helicopter#" + this.name + "(" + this.id + ")" + " registered to weather tower.");
        }
    }