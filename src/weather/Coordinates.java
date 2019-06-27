/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Coordinates.java                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/25 13:16:34 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/27 13:52:59 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package weather;

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    public Coordinates(int longitude, int latitude, int height){
        if (longitude < 0)
            longitude = 0;
        else if (latitude < 0)
            latitude = 0;
        else if (height < 0)
            height = 0;
        else if (height > 100)
            height = 100;
        this.longitude = longitude;
        this.latitude = latitude;
        this.height = height;
        
    }
    public getLongtitude(){
        
    }
    public getLatitude(){
        
    }
    public getHeight(){
        
    }
}