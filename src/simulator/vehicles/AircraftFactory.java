/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   AircraftFactory.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/25 10:49:41 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/27 12:10:12 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package simulator.vehicles;

import weather.Coordinates;

public class AircraftFactory {
    public Flyable newAircarft(String type, String name, String longitude, int latitude, int height) {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        
        if (type.toLowerCase().equals("baloon"))
            return new Baloon(name, coordinates);
        else if (type.toLowerCase().equals("Jetplane"))
            return new JetPLane(name, coordinates);
        else if (type.toLower().equals("Helicopter"))
            return new Helicopter(name, coordinates);
        return null;
    }
}