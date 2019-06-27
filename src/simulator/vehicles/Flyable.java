/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Flyable.java                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/25 14:02:32 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/27 11:47:40 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

package src.simulator.vehicles;

import src.simulator.WeatherTower;

public interface Flyable {
    public void updateConditions();
    public void registerTower(WeatherTower WeatherTower);
}