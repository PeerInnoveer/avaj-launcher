/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Simulator.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/24 15:01:08 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/24 15:42:46 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Simulator {
    public static void main(String[] args)throws InterruptedException {
        File file = new File("../../scenario.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String st;
        while ((st = br.readLine()) != null)
        System.out.println(st);
        br.close();
    }
}