/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/24 15:01:08 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/25 15:16:18 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

class Simulator {
    public static void main(String[] args) {
        try {
            File file = new File("../../scenario.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            
            String line = br.readLine();
            System.out.println(line);
            br.close();
            
            
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}