/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   WeatherProvider.java                               :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/25 13:26:54 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/25 14:06:43 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package weather;

public class WeatherProvider {
    
    private WeatherProvider weatherProvider;
    private String[] weather;
    
    private WeatherProvider(){
        
    }
    public WeatherProvider getProvider(){
        return weatherProvider;
        
    }
    public String getCurrentWeather(Coordinates coordinates){
        return null;
        
    }
}