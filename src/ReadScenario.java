/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Main.java                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: pvan-ren <pvan-ren@student.42.fr>          +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2019/06/21 10:36:37 by pvan-ren          #+#    #+#             */
/*   Updated: 2019/06/21 14:29:52 by pvan-ren         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class ReadScenario {
    public static void main(String[] args)throws Exception {
        File file = new File("../scenario.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        while ((st = br.readLine()) != null)
        System.out.println(st);
    }
}

// public class Main {
    
//     public static void main(String[] args) {
//         System.out.println("Hi there!");
//     }
// } 